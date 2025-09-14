package de.kuhlmann.raphael.exampreparation.core.model

import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.app_name

sealed interface ExamPreparationUiState {

    data class Setup(
        val categorySelections: List<CategorySelection>,
        val onSelectAllCategoriesClick: () -> Unit,
        val onDeselectAllCategoriesClick: () -> Unit,
        val isSolutionAvailable: Boolean,
        val onSolutionAvailabilityChangeClick: () -> Unit,
        val isSubsetOfQuestions: Boolean,
        val onSubsetOfQuestionsChangeClick: () -> Unit,
        val canBeStarted: Boolean,
        val onStartClick: () -> Unit
    ) : ExamPreparationUiState

    data class Task(
        val shuffledAnswersSeed: Long,
        val task: TaskDefinition,
        val isEvaluated: Boolean,
        val isSolutionAvailable: Boolean,
        val isSolutionVisible: Boolean,
        val onToggleSolutionClick: () -> Unit,
        val isPreviousAvailable: Boolean,
        val onPreviousClick: () -> Unit,
        val isNextAvailable: Boolean,
        val onNextClick: () -> Unit,
        val onFinishClick: () -> Unit,
        val pageCount: String
    ) : ExamPreparationUiState

    data class Evaluation(
        val scoreInPercent: Int,
        val wrongAnswersCount: Int,
        val correctAnswersCount: Int,
        val onShowSolutionClick: () -> Unit,
        val onFinishClick: () -> Unit
    ) : ExamPreparationUiState

}