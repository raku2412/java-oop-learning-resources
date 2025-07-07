package de.kuhlmann.raphael.exampreparation.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.kuhlmann.raphael.exampreparation.core.model.ExamPreparationUiState
import de.kuhlmann.raphael.exampreparation.core.viewmodel.ExamPreparationViewModel
import de.kuhlmann.raphael.exampreparation.feature.evaluation.ui.EvaluationContent
import de.kuhlmann.raphael.exampreparation.feature.setup.ui.SetupContent
import de.kuhlmann.raphael.exampreparation.feature.task.ui.TaskContent

@Composable
fun MainScreen() {

    val viewModel = remember { ExamPreparationViewModel() }
    val state by viewModel.state.collectAsStateWithLifecycle()

    if (state != null) {
        @Suppress("KotlinConstantConditions")
        when (state) {
            is ExamPreparationUiState.Setup -> {
                SetupContent(state as ExamPreparationUiState.Setup)
            }

            is ExamPreparationUiState.Task -> {
                TaskContent(state as ExamPreparationUiState.Task)
            }

            is ExamPreparationUiState.Evaluation -> {
                EvaluationContent(state as ExamPreparationUiState.Evaluation)
            }

            null -> {}
        }
    } else {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }


}