package de.kuhlmann.raphael.exampreparation.feature.task.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import de.kuhlmann.raphael.exampreparation.core.model.ExamPreparationUiState
import de.kuhlmann.raphael.exampreparation.core.model.TaskDefinition
import de.kuhlmann.raphael.exampreparation.core.model.TaskElement
import de.kuhlmann.raphael.exampreparation.core.ui.TaskElementContent
import de.kuhlmann.raphael.exampreparation.core.ui.TaskElementPrefixArrangement
import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.examination_hide_solution_button_title
import exampreparation.composeapp.generated.resources.examination_show_solution_button_title
import exampreparation.composeapp.generated.resources.finish
import exampreparation.composeapp.generated.resources.next
import exampreparation.composeapp.generated.resources.previous
import exampreparation.composeapp.generated.resources.task_description
import org.jetbrains.compose.resources.stringResource

@Composable
fun TaskContent(state: ExamPreparationUiState.Task) {
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
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(state.task.category.title),
                    style = MaterialTheme.typography.bodySmall.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
                TaskElementContent(
                    prefix = stringResource(Res.string.task_description),
                    arrangement = TaskElementPrefixArrangement.TOP,
                    taskElement = state.task.description
                )
                when (state.task) {
                    is TaskDefinition.SingleChoice -> {
                        ChoiceContent(
                            isSingleChoice = true,
                            isEvaluated = state.isEvaluated,
                            isSolutionVisible = state.isSolutionVisible,
                            answers = state.task.getShuffledAnswers(state.shuffledAnswersSeed),
                            selectedAnswers = state.task.selectedAnswer?.let {
                                listOf(it)
                            } ?: emptyList(),
                            correctAnswers = listOf(state.task.correctAnswer),
                            onAnswerClick = state.task.onAnswerSelected
                        )
                    }

                    is TaskDefinition.MultipleChoice -> {
                        ChoiceContent(
                            isSingleChoice = false,
                            isEvaluated = state.isEvaluated,
                            isSolutionVisible = state.isSolutionVisible,
                            answers = state.task.getShuffledAnswers(state.shuffledAnswersSeed),
                            selectedAnswers = state.task.selectedAnswers,
                            correctAnswers = state.task.correctAnswers,
                            onAnswerClick = state.task.onAnswerSelected
                        )
                    }

                    is TaskDefinition.Code -> {
                        // TODO: Add code task content handling, once code tasks are added
                    }
                }
            }

        }
        TaskControlRow(state)
    }
}

@Composable
private fun ChoiceContent(
    isSingleChoice: Boolean,
    isEvaluated: Boolean,
    isSolutionVisible: Boolean,
    answers: List<TaskElement>,
    selectedAnswers: List<TaskElement>,
    correctAnswers: List<TaskElement>,
    onAnswerClick: (TaskElement) -> Unit
) {
    answers.forEachIndexed { index, answer ->
        Row(
            modifier = Modifier
                .background(
                    color = if (isEvaluated || isSolutionVisible) {
                        if (correctAnswers.contains(answer)) {
                            Color.Green.copy(alpha = 0.5f)
                        } else {
                            Color.Red.copy(alpha = 0.5f)
                        }
                    } else {
                        Color.Transparent
                    }
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
        ) {
            val isSelected = selectedAnswers.contains(answer)
            if (isSingleChoice) {
                RadioButton(
                    enabled = !isEvaluated,
                    selected = isSelected,
                    onClick = {
                        onAnswerClick(answer)
                    }
                )
            } else {
                Checkbox(
                    enabled = !isEvaluated,
                    checked = isSelected,
                    onCheckedChange = {
                        onAnswerClick(answer)
                    }
                )
            }
            TaskElementContent(
                prefix = ('a' + index).toString() + ")",
                taskElement = answer
            )
        }
    }
}

@Composable
private fun TaskControlRow(state: ExamPreparationUiState.Task) {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            enabled = state.isSolutionAvailable,
            onClick = state.onToggleSolutionClick
        ) {
            Text(
                text = stringResource(
                    if (state.isSolutionVisible) {
                        Res.string.examination_hide_solution_button_title
                    } else {
                        Res.string.examination_show_solution_button_title
                    }
                ),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            enabled = state.isPreviousAvailable,
            onClick = state.onPreviousClick
        ) {
            Text(
                text = stringResource(Res.string.previous),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = state.pageCount,
            style = MaterialTheme.typography.bodyMedium
        )
        Button(
            enabled = state.isNextAvailable,
            onClick = state.onNextClick
        ) {
            Text(
                text = stringResource(Res.string.next),
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