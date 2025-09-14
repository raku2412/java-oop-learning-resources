package de.kuhlmann.raphael.exampreparation.core.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.kuhlmann.raphael.exampreparation.core.model.Category
import de.kuhlmann.raphael.exampreparation.core.model.CategorySelection
import de.kuhlmann.raphael.exampreparation.core.model.ExamPreparationUiState
import de.kuhlmann.raphael.exampreparation.core.model.Mode
import de.kuhlmann.raphael.exampreparation.core.model.TaskDefinition
import de.kuhlmann.raphael.exampreparation.core.model.TaskConfiguration
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlin.random.Random

class ExamPreparationViewModel : ViewModel() {

    private val mode = MutableStateFlow(Mode.SETUP)
    private val selectedCategories = MutableStateFlow<List<Category>>(Category.entries)
    private val isSolutionAvailable = MutableStateFlow(false)
    private val isSubsetOfQuestions = MutableStateFlow(true)
    private val isSolutionVisible = MutableStateFlow(false)
    private val isEvaluated = MutableStateFlow(false)
    private val seedSet = MutableStateFlow<List<Long>>(emptyList())
    private val taskSet = MutableStateFlow<List<TaskDefinition>>(emptyList())
    private val pageIndex = MutableStateFlow(0)

    @Suppress("UNCHECKED_CAST")
    val state = combine(
        mode,
        selectedCategories,
        isSolutionAvailable,
        isSubsetOfQuestions,
        isSolutionVisible,
        isEvaluated,
        seedSet,
        taskSet,
        pageIndex,
    ) { values ->

        val mode = values[0] as Mode
        val selectedCategories = values[1] as List<Category>
        val isSolutionAvailable = values[2] as Boolean
        val isSubsetOfQuestions = values[3] as Boolean
        val isSolutionVisible = values[4] as Boolean
        val isEvaluated = values[5] as Boolean
        val seedSet = values[6] as List<Long>
        val taskSet = values[7] as List<TaskDefinition>
        val pageIndex = values[8] as Int

        when (mode) {
            Mode.SETUP -> ExamPreparationUiState.Setup(
                categorySelections = getCategorySelections(selectedCategories),
                onSelectAllCategoriesClick = ::onSelectAllCategoriesClick,
                onDeselectAllCategoriesClick = ::onDeselectAllCategoriesClick,
                isSolutionAvailable = isSolutionAvailable,
                onSolutionAvailabilityChangeClick = ::onSolutionAvailabilityChangeClick,
                isSubsetOfQuestions = isSubsetOfQuestions,
                onSubsetOfQuestionsChangeClick = ::onSubsetOfQuestionsChangeClick,
                canBeStarted = selectedCategories.isNotEmpty(),
                onStartClick = ::startExam
            )

            Mode.EXAMINATION -> ExamPreparationUiState.Task(
                shuffledAnswersSeed = seedSet[pageIndex],
                task = taskSet[pageIndex],
                isEvaluated = isEvaluated,
                isSolutionAvailable = isSolutionAvailable,
                isSolutionVisible = isSolutionVisible,
                onToggleSolutionClick = { this.isSolutionVisible.value = !isSolutionVisible },
                isPreviousAvailable = pageIndex > 0,
                onPreviousClick = {
                    this.isSolutionVisible.value = false
                    this.pageIndex.value = pageIndex - 1
                },
                isNextAvailable = pageIndex < taskSet.lastIndex,
                onNextClick = {
                    this.isSolutionVisible.value = false
                    this.pageIndex.value = pageIndex + 1
                },
                onFinishClick = {
                    this.isSolutionVisible.value = false
                    this.isEvaluated.value = true
                    this.mode.value = Mode.EVALUATION
                },
                pageCount = "${pageIndex + 1} / ${taskSet.size}"
            )

            Mode.EVALUATION -> {
                val correctAnswersCount = taskSet.count { task ->
                    when (task) {
                        is TaskDefinition.SingleChoice -> task.selectedAnswer == task.correctAnswer
                        is TaskDefinition.MultipleChoice -> task.selectedAnswers.toSet() == task.correctAnswers.toSet()
                        is TaskDefinition.Code -> task.evaluateIfSolutionIsCorrect(task.answer)
                    }
                }
                val wrongAnswersCount = taskSet.size - correctAnswersCount
                val scoreInPercent = if (taskSet.isNotEmpty()) {
                    (correctAnswersCount * 100) / taskSet.size
                } else {
                    0
                }
                ExamPreparationUiState.Evaluation(
                    scoreInPercent = scoreInPercent,
                    wrongAnswersCount = wrongAnswersCount,
                    correctAnswersCount = correctAnswersCount,
                    onShowSolutionClick = {
                        this.pageIndex.value = 0
                        this.mode.value = Mode.EXAMINATION
                    },
                    onFinishClick = {
                        this.mode.value = Mode.SETUP
                    }
                )
            }
        }

    }.stateIn(
        viewModelScope,
        SharingStarted.Companion.WhileSubscribed(5000L),
        null
    )

    private fun getCategorySelections(selectedCategories: List<Category>): List<CategorySelection> =
        Category.entries.map {
            CategorySelection(
                category = it,
                isSelected = selectedCategories.contains(it),
                onChangeSelectionClick = {
                    val newSelectedCategories = if (selectedCategories.contains(it)) {
                        selectedCategories - it
                    } else {
                        selectedCategories + it
                    }
                    this.selectedCategories.value = newSelectedCategories
                }
            )
        }

    private fun onSelectAllCategoriesClick() {
        selectedCategories.value = Category.entries
    }

    private fun onDeselectAllCategoriesClick() {
        selectedCategories.value = emptyList()
    }

    private fun onSolutionAvailabilityChangeClick() {
        isSolutionAvailable.value = !isSolutionAvailable.value
    }

    private fun onSubsetOfQuestionsChangeClick() {
        isSubsetOfQuestions.value = !isSubsetOfQuestions.value
    }

    private fun startExam() {
        pageIndex.value = 0
        isEvaluated.value = false
        getTaskSet().let { tasks ->
            if (tasks.isNotEmpty()) {
                taskSet.value = tasks
                seedSet.value = taskSet.value.map { Random.nextLong() }
                mode.value = Mode.EXAMINATION
            }
        }
    }

    private fun getTaskSet(): List<TaskDefinition> =
        TaskConfiguration.tasks
            .filter {
                it.category in selectedCategories.value
            }
            .prepareAccordingToSubsetSelection()
            .mapIndexed { index, taskDefinition ->
                when (taskDefinition) {
                    is TaskDefinition.SingleChoice -> taskDefinition.copy(
                        onAnswerSelected = {
                            taskSet.value = taskSet.value.mapIndexed { i, task ->
                                if (i == index && task is TaskDefinition.SingleChoice) {
                                    taskDefinition.copy(
                                        selectedAnswer = it,
                                        onAnswerSelected = task.onAnswerSelected
                                    )
                                } else {
                                    task
                                }
                            }
                        },
                    )

                    is TaskDefinition.MultipleChoice -> taskDefinition.copy(
                        onAnswerSelected = {
                            taskSet.value = taskSet.value.mapIndexed { i, task ->
                                if (i == index && task is TaskDefinition.MultipleChoice) {
                                    val newSelectedAnswers =
                                        if (task.selectedAnswers.contains(it)) {
                                            task.selectedAnswers - it
                                        } else {
                                            task.selectedAnswers + it
                                        }
                                    taskDefinition.copy(
                                        selectedAnswers = newSelectedAnswers,
                                        onAnswerSelected = task.onAnswerSelected
                                    )
                                } else {
                                    task
                                }
                            }
                        }
                    )

                    is TaskDefinition.Code -> taskDefinition.copy(
                        onAnswerChange = { answer ->
                            taskSet.value = taskSet.value.mapIndexed { i, task ->
                                if (i == index && task is TaskDefinition.Code) {
                                    taskDefinition.copy(
                                        answer = answer,
                                        onAnswerChange = task.onAnswerChange
                                    )
                                } else {
                                    task
                                }
                            }
                        }
                    )
                }
            }

    private fun <T> Iterable<T>.prepareAccordingToSubsetSelection() =
        if (isSubsetOfQuestions.value) {
            this.shuffled(Random(System.currentTimeMillis()))
                .take(20)
        } else {
            this
        }

}