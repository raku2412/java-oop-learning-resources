package de.kuhlmann.raphael.exampreparation.core.model

import androidx.compose.ui.text.input.TextFieldValue
import kotlin.random.Random

sealed class TaskDefinition(
    val category: Category,
    val description: TaskElement
) {

    class SingleChoice(
        category: Category,
        description: TaskElement,
        val correctAnswer: TaskElement,
        val answers: List<TaskElement>,
        val selectedAnswer: TaskElement? = null,
        val onAnswerSelected: (TaskElement) -> Unit = {}
    ) : TaskDefinition(category, description) {

        fun copy(
            category: Category = this.category,
            description: TaskElement = this.description,
            correctAnswer: TaskElement = this.correctAnswer,
            answers: List<TaskElement> = this.answers,
            selectedAnswer: TaskElement? = this.selectedAnswer,
            onAnswerSelected: (TaskElement) -> Unit = this.onAnswerSelected
        ): SingleChoice = SingleChoice(
            category, description, correctAnswer, answers, selectedAnswer, onAnswerSelected
        )

        fun getShuffledAnswers(seed: Long): List<TaskElement> {
            return (answers + correctAnswer).shuffled(Random(seed))
        }

    }

    class MultipleChoice(
        category: Category,
        description: TaskElement,
        val correctAnswers: List<TaskElement>,
        val answers: List<TaskElement>,
        val selectedAnswers: List<TaskElement> = emptyList(),
        val onAnswerSelected: (TaskElement) -> Unit = {},
    ) : TaskDefinition(category, description) {

        fun copy(
            category: Category = this.category,
            description: TaskElement = this.description,
            correctAnswers: List<TaskElement> = this.correctAnswers,
            answers: List<TaskElement> = this.answers,
            selectedAnswers: List<TaskElement> = this.selectedAnswers,
            onAnswerSelected: (TaskElement) -> Unit = this.onAnswerSelected
        ): MultipleChoice = MultipleChoice(
            category, description, correctAnswers, answers, selectedAnswers, onAnswerSelected
        )

        fun getShuffledAnswers(seed: Long): List<TaskElement> {
            return (answers + correctAnswers).shuffled(Random(seed))
        }

    }

    class Code(
        category: Category,
        description: TaskElement,
        val answer: TextFieldValue = TextFieldValue(),
        val onAnswerChange: (TextFieldValue) -> Unit = {},
        val evaluateIfSolutionIsCorrect: (TextFieldValue) -> Boolean
    ) : TaskDefinition(category, description) {

        fun copy(
            category: Category = this.category,
            description: TaskElement = this.description,
            answer: TextFieldValue = this.answer,
            onAnswerChange: (TextFieldValue) -> Unit = this.onAnswerChange,
            evaluateIfSolutionIsCorrect: (TextFieldValue) -> Boolean = this.evaluateIfSolutionIsCorrect
        ): Code = Code(
            category, description, answer, onAnswerChange, evaluateIfSolutionIsCorrect
        )

    }

}