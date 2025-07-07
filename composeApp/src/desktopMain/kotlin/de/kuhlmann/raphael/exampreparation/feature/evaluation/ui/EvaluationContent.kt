package de.kuhlmann.raphael.exampreparation.feature.evaluation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.kuhlmann.raphael.exampreparation.core.model.ExamPreparationUiState
import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.evaluation_correct_answers
import exampreparation.composeapp.generated.resources.evaluation_score
import exampreparation.composeapp.generated.resources.evaluation_wrong_answers
import exampreparation.composeapp.generated.resources.examination_show_solution_button_title
import exampreparation.composeapp.generated.resources.finish
import org.jetbrains.compose.resources.stringResource

@Composable
fun EvaluationContent(state: ExamPreparationUiState.Evaluation) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
            ) {
                Text(
                    text = stringResource(Res.string.evaluation_score),
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "${state.scoreInPercent}%",
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = stringResource(Res.string.evaluation_wrong_answers),
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "${state.wrongAnswersCount}",
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = stringResource(Res.string.evaluation_correct_answers),
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "${state.correctAnswersCount}",
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
        EvaluationControlRow(state)
    }
}

@Composable
private fun EvaluationControlRow(state: ExamPreparationUiState.Evaluation) {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = state.onShowSolutionClick
        ) {
            Text(
                text = stringResource(Res.string.examination_show_solution_button_title),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = state.onFinishClick
        ) {
            Text(
                text = stringResource(Res.string.finish),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}