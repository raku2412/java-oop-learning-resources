package de.kuhlmann.raphael.exampreparation.core.model

import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.object_classes_task_10_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_10_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_10_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_10_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_10_description
import exampreparation.composeapp.generated.resources.object_classes_task_11_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_11_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_11_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_11_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_11_description
import exampreparation.composeapp.generated.resources.object_classes_task_12_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_12_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_12_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_12_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_12_description
import exampreparation.composeapp.generated.resources.object_classes_task_1_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_1_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_1_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_1_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_1_description
import exampreparation.composeapp.generated.resources.object_classes_task_2_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_2_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_2_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_2_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_2_description
import exampreparation.composeapp.generated.resources.object_classes_task_3_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_3_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_3_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_3_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_3_description
import exampreparation.composeapp.generated.resources.object_classes_task_4_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_4_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_4_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_4_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_4_description
import exampreparation.composeapp.generated.resources.object_classes_task_5_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_5_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_5_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_5_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_5_description
import exampreparation.composeapp.generated.resources.object_classes_task_6_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_6_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_6_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_6_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_6_description
import exampreparation.composeapp.generated.resources.object_classes_task_7_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_7_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_7_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_7_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_7_description
import exampreparation.composeapp.generated.resources.object_classes_task_8_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_8_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_8_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_8_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_8_description
import exampreparation.composeapp.generated.resources.object_classes_task_9_answer_1
import exampreparation.composeapp.generated.resources.object_classes_task_9_answer_2
import exampreparation.composeapp.generated.resources.object_classes_task_9_answer_3
import exampreparation.composeapp.generated.resources.object_classes_task_9_answer_4
import exampreparation.composeapp.generated.resources.object_classes_task_9_description

object TaskConfiguration {

    val tasks = listOf(
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_1_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_1_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_1_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_2_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_2_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_2_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_3_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_3_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_3_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_4_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_4_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_4_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_4_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_4_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_5_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_5_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_5_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_5_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_6_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_6_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_6_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_6_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_7_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_7_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_7_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_7_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_7_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_8_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_8_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_8_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_8_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_9_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_9_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_9_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_9_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_10_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_10_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_10_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_10_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_10_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_11_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_11_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_11_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_11_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_11_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_12_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_12_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_12_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_12_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_12_answer_4)
            )
        ),
    )

}