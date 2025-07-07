package de.kuhlmann.raphael.exampreparation.feature.setup.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.kuhlmann.raphael.exampreparation.core.model.CategorySelection
import de.kuhlmann.raphael.exampreparation.core.model.ExamPreparationUiState
import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.categories_title
import exampreparation.composeapp.generated.resources.setup_category_selection_title
import exampreparation.composeapp.generated.resources.setup_deselect_all_categories_button_title
import exampreparation.composeapp.generated.resources.setup_select_all_categories_button_title
import exampreparation.composeapp.generated.resources.setup_test_solutions_available_description
import exampreparation.composeapp.generated.resources.setup_test_solutions_available_title
import exampreparation.composeapp.generated.resources.setup_title
import exampreparation.composeapp.generated.resources.start
import org.jetbrains.compose.resources.stringResource

@Composable
fun SetupContent(state: ExamPreparationUiState.Setup) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(Res.string.setup_title),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = stringResource(Res.string.setup_category_selection_title),
                style = MaterialTheme.typography.bodyMedium
            )
            CategoryMultiSelect(
                onSelectAllCategoriesClick = state.onSelectAllCategoriesClick,
                onDeselectAllCategoriesClick = state.onDeselectAllCategoriesClick
            )
            CategorySelections(state.categorySelections)
            SolutionAvailability(
                state.isSolutionAvailable,
                state.onSolutionAvailabilityChangeClick
            )
            Button(
                enabled = state.canBeStarted,
                onClick = state.onStartClick
            ) {
                Text(
                    text = stringResource(Res.string.start),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
private fun CategoryMultiSelect(
    onSelectAllCategoriesClick: () -> Unit,
    onDeselectAllCategoriesClick: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onSelectAllCategoriesClick
        ) {
            Text(
                text = stringResource(Res.string.setup_select_all_categories_button_title),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Button(
            onClick = onDeselectAllCategoriesClick
        ) {
            Text(
                text = stringResource(Res.string.setup_deselect_all_categories_button_title),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
private fun CategorySelections(selections: List<CategorySelection>) {
    var isExpanded by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .clickable { isExpanded = !isExpanded }
                .pointerHoverIcon(PointerIcon.Hand)
                .padding(vertical = 8.dp, horizontal = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = if (isExpanded) "▼" else "►",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = stringResource(Res.string.categories_title),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        if (isExpanded) {
            selections.forEach {
                Row(
                    modifier = Modifier
                        .width(400.dp)
                        .clickable(onClick = it.onChangeSelectionClick)
                        .pointerHoverIcon(PointerIcon.Hand),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = it.isSelected,
                        onCheckedChange = { _ -> it.onChangeSelectionClick() },
                    )
                    Text(
                        text = stringResource(it.category.title),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun SolutionAvailability(
    isSolutionAvailable: Boolean,
    onSolutionAvailabilityChangeClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(Res.string.setup_test_solutions_available_description),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .clickable(onClick = onSolutionAvailabilityChangeClick)
                .pointerHoverIcon(PointerIcon.Hand),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Checkbox(
                checked = isSolutionAvailable,
                onCheckedChange = { _ -> onSolutionAvailabilityChangeClick() }
            )
            Text(
                text = stringResource(Res.string.setup_test_solutions_available_title),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}