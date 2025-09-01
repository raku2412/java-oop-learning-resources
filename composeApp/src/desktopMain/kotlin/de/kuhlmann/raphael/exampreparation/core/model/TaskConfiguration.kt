package de.kuhlmann.raphael.exampreparation.core.model

import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.*

object TaskConfiguration {

    val tasks = listOf(

        // region object classes
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
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_13_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_13_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_13_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_13_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_13_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_14_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_14_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_14_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_14_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_14_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_15_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_15_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_15_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_15_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_15_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_16_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_16_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_16_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_16_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_16_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_17_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_17_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_17_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_17_answer_4)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_17_answer_3)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_18_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_18_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_18_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_18_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_18_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_19_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_19_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_19_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_19_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_19_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_20_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_20_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_20_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_20_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_20_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_21_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_21_answer_4),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_21_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_21_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_21_answer_3)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_22_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_22_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_22_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_22_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_22_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_23_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_23_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_23_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_23_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_23_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_24_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_24_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_24_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_24_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_24_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_25_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_25_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_25_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_25_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_25_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_26_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_26_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_26_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_26_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_26_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_27_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_27_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_27_answer_3)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_27_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_27_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_28_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_28_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_28_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_28_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_28_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_29_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_29_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_29_answer_3)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_29_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_29_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_30_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_30_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_30_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_30_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_30_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_31_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_31_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_31_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_31_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_31_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_32_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_32_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_32_answer_3)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_32_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_32_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_33_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_33_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_33_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_33_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_33_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_34_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_34_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_34_answer_3)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_34_answer_2),
                TaskElement.Text(value = Res.string.object_classes_task_34_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_35_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_35_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_35_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_35_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_35_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_36_description),
            correctAnswer = TaskElement.Text(value = Res.string.object_classes_task_36_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_36_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_36_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_36_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.OBJECT_CLASSES,
            description = TaskElement.Text(value = Res.string.object_classes_task_37_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_37_answer_1),
                TaskElement.Text(value = Res.string.object_classes_task_37_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.object_classes_task_37_answer_3),
                TaskElement.Text(value = Res.string.object_classes_task_37_answer_4)
            )
        ),
        // endregion

        // region program structure
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_1_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_1_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_1_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_2_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_2_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_2_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_3_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_3_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_3_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_3_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_4_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_4_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_4_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_4_answer_2),
                TaskElement.Text(value = Res.string.program_structure_task_4_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_5_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_5_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_5_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_5_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_6_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_6_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_6_answer_2),
                TaskElement.Text(value = Res.string.program_structure_task_6_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_7_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_7_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_7_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_7_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_7_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_8_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_8_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_8_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_8_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_9_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_9_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_9_answer_3),
                TaskElement.Text(value = Res.string.program_structure_task_9_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.PROGRAM_STRUCTURE,
            description = TaskElement.Text(value = Res.string.program_structure_task_10_description),
            correctAnswer = TaskElement.Text(value = Res.string.program_structure_task_10_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.program_structure_task_10_answer_1),
                TaskElement.Text(value = Res.string.program_structure_task_10_answer_2),
                TaskElement.Text(value = Res.string.program_structure_task_10_answer_4)
            )
        ),
        // endregion

        // region java api
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_1_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_1_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_1_answer_2),
                TaskElement.Text(value = Res.string.java_api_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_2_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_2_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_2_answer_2),
                TaskElement.Text(value = Res.string.java_api_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_3_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_3_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_3_answer_3),
                TaskElement.Text(value = Res.string.java_api_task_3_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_4_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_4_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_4_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_4_answer_3),
                TaskElement.Text(value = Res.string.java_api_task_4_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_5_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_5_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_5_answer_2),
                TaskElement.Text(value = Res.string.java_api_task_5_answer_3),
                TaskElement.Text(value = Res.string.java_api_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_6_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_6_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_6_answer_3),
                TaskElement.Text(value = Res.string.java_api_task_6_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_7_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_7_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_7_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_7_answer_3),
                TaskElement.Text(value = Res.string.java_api_task_7_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_8_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_8_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_8_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_8_answer_2),
                TaskElement.Text(value = Res.string.java_api_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_9_answer_3),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_9_answer_1),
                TaskElement.Text(value = Res.string.java_api_task_9_answer_2),
                TaskElement.Text(value = Res.string.java_api_task_9_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.JAVA_API,
            description = TaskElement.Text(value = Res.string.java_api_task_10_description),
            correctAnswer = TaskElement.Text(value = Res.string.java_api_task_10_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.java_api_task_10_answer_2),
                TaskElement.Text(value = Res.string.java_api_task_10_answer_3),
                TaskElement.Text(value = Res.string.java_api_task_10_answer_4)
            )
        ),
        // endregion

        // region arrays
        TaskDefinition.SingleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.arrays_task_1_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_1_answer_2),
                TaskElement.Text(value = Res.string.arrays_task_1_answer_3),
                TaskElement.Text(value = Res.string.arrays_task_1_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_2_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_2_answer_2),
                TaskElement.Text(value = Res.string.arrays_task_2_answer_4)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_2_answer_1),
                TaskElement.Text(value = Res.string.arrays_task_2_answer_3)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.arrays_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_3_answer_2),
                TaskElement.Text(value = Res.string.arrays_task_3_answer_3),
                TaskElement.Text(value = Res.string.arrays_task_3_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_4_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_4_answer_1),
                TaskElement.Text(value = Res.string.arrays_task_4_answer_2),
                TaskElement.Text(value = Res.string.arrays_task_4_answer_4)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_4_answer_3)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_5_description),
            correctAnswer = TaskElement.Text(value = Res.string.arrays_task_5_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_5_answer_1),
                TaskElement.Text(value = Res.string.arrays_task_5_answer_3),
                TaskElement.Text(value = Res.string.arrays_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.arrays_task_6_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_6_answer_1),
                TaskElement.Text(value = Res.string.arrays_task_6_answer_3),
                TaskElement.Text(value = Res.string.arrays_task_6_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_7_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_7_answer_1),
                TaskElement.Text(value = Res.string.arrays_task_7_answer_3)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_7_answer_2),
                TaskElement.Text(value = Res.string.arrays_task_7_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_8_description),
            correctAnswer = TaskElement.Text(value = Res.string.arrays_task_8_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_8_answer_2),
                TaskElement.Text(value = Res.string.arrays_task_8_answer_3),
                TaskElement.Text(value = Res.string.arrays_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ARRAYS,
            description = TaskElement.Text(value = Res.string.arrays_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.arrays_task_9_answer_2),
            answers = listOf(
                TaskElement.Text(value = Res.string.arrays_task_9_answer_1),
                TaskElement.Text(value = Res.string.arrays_task_9_answer_3),
                TaskElement.Text(value = Res.string.arrays_task_9_answer_4)
            )
        ),
        // endregion

        // region enumerations
        TaskDefinition.SingleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.enumerations_task_1_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_1_answer_2),
                TaskElement.Text(value = Res.string.enumerations_task_1_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.enumerations_task_2_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_2_answer_2),
                TaskElement.Text(value = Res.string.enumerations_task_2_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.enumerations_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_3_answer_2),
                TaskElement.Text(value = Res.string.enumerations_task_3_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_3_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_4_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_4_answer_1),
                TaskElement.Text(value = Res.string.enumerations_task_4_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_4_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_4_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_5_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_5_answer_1),
                TaskElement.Text(value = Res.string.enumerations_task_5_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_5_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.enumerations_task_6_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_6_answer_2),
                TaskElement.Text(value = Res.string.enumerations_task_6_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_6_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_7_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_7_answer_1),
                TaskElement.Text(value = Res.string.enumerations_task_7_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_7_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_7_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_8_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_8_answer_1),
                TaskElement.Text(value = Res.string.enumerations_task_8_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_8_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.ENUMERATIONS,
            description = TaskElement.Text(value = Res.string.enumerations_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.enumerations_task_9_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.enumerations_task_9_answer_2),
                TaskElement.Text(value = Res.string.enumerations_task_9_answer_3),
                TaskElement.Text(value = Res.string.enumerations_task_9_answer_4)
            )
        ),
        // endregion

        // region inheritance
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_1_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_1_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_1_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_2_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_2_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_2_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_3_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_3_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_3_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_4_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_4_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_4_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_4_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_4_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_5_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_5_answer_1),
                TaskElement.Text(value = Res.string.inheritance_task_5_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_5_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_6_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_6_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_6_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_6_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_7_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_7_answer_1),
                TaskElement.Text(value = Res.string.inheritance_task_7_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_7_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_7_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_8_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_8_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_8_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_8_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INHERITANCE,
            description = TaskElement.Text(value = Res.string.inheritance_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.inheritance_task_9_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.inheritance_task_9_answer_2),
                TaskElement.Text(value = Res.string.inheritance_task_9_answer_3),
                TaskElement.Text(value = Res.string.inheritance_task_9_answer_4)
            )
        ),
        // endregion

        // region polymorphism
        TaskDefinition.MultipleChoice(
            category = Category.POLYMORPHISM,
            description = TaskElement.Text(value = Res.string.polymorphism_task_1_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_1_answer_1),
                TaskElement.Text(value = Res.string.polymorphism_task_1_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_1_answer_3),
                TaskElement.Text(value = Res.string.polymorphism_task_1_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.POLYMORPHISM,
            description = TaskElement.Text(value = Res.string.polymorphism_task_2_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_2_answer_1),
                TaskElement.Text(value = Res.string.polymorphism_task_2_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_2_answer_3),
                TaskElement.Text(value = Res.string.polymorphism_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.POLYMORPHISM,
            description = TaskElement.Text(value = Res.string.polymorphism_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.polymorphism_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_3_answer_2),
                TaskElement.Text(value = Res.string.polymorphism_task_3_answer_3),
                TaskElement.Text(value = Res.string.polymorphism_task_3_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.POLYMORPHISM,
            description = TaskElement.Text(value = Res.string.polymorphism_task_4_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_4_answer_1),
                TaskElement.Text(value = Res.string.polymorphism_task_4_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_4_answer_3),
                TaskElement.Text(value = Res.string.polymorphism_task_4_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.POLYMORPHISM,
            description = TaskElement.Text(value = Res.string.polymorphism_task_5_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_5_answer_1),
                TaskElement.Text(value = Res.string.polymorphism_task_5_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_5_answer_3),
                TaskElement.Text(value = Res.string.polymorphism_task_5_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.POLYMORPHISM,
            description = TaskElement.Text(value = Res.string.polymorphism_task_6_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_6_answer_1),
                TaskElement.Text(value = Res.string.polymorphism_task_6_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.polymorphism_task_6_answer_3),
                TaskElement.Text(value = Res.string.polymorphism_task_6_answer_4)
            )
        ),
        // endregion

        // region exception handling
        TaskDefinition.MultipleChoice(
            category = Category.EXCEPTION_HANDLING,
            description = TaskElement.Text(value = Res.string.exception_handling_task_1_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_1_answer_1),
                TaskElement.Text(value = Res.string.exception_handling_task_1_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_1_answer_3),
                TaskElement.Text(value = Res.string.exception_handling_task_1_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.EXCEPTION_HANDLING,
            description = TaskElement.Text(value = Res.string.exception_handling_task_2_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_2_answer_1),
                TaskElement.Text(value = Res.string.exception_handling_task_2_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_2_answer_3),
                TaskElement.Text(value = Res.string.exception_handling_task_2_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.EXCEPTION_HANDLING,
            description = TaskElement.Text(value = Res.string.exception_handling_task_3_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_3_answer_1),
                TaskElement.Text(value = Res.string.exception_handling_task_3_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_3_answer_3),
                TaskElement.Text(value = Res.string.exception_handling_task_3_answer_4)
            )
        ),
        TaskDefinition.MultipleChoice(
            category = Category.EXCEPTION_HANDLING,
            description = TaskElement.Text(value = Res.string.exception_handling_task_4_description),
            correctAnswers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_4_answer_1),
                TaskElement.Text(value = Res.string.exception_handling_task_4_answer_2)
            ),
            answers = listOf(
                TaskElement.Text(value = Res.string.exception_handling_task_4_answer_3),
                TaskElement.Text(value = Res.string.exception_handling_task_4_answer_4)
            )
        ),
        // endregion

        // region interfaces
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_1_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_1_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_1_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_2_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_2_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_2_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_3_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_3_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_3_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_4_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_4_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_4_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_4_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_4_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_5_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_5_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_5_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_5_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_6_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_6_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_6_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_6_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_7_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_7_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_7_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_7_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_7_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.INTERFACES,
            description = TaskElement.Text(value = Res.string.interfaces_task_8_description),
            correctAnswer = TaskElement.Text(value = Res.string.interfaces_task_8_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.interfaces_task_8_answer_2),
                TaskElement.Text(value = Res.string.interfaces_task_8_answer_3),
                TaskElement.Text(value = Res.string.interfaces_task_8_answer_4)
            )
        ),
        // endregion

        //region generics
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_1_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_1_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_1_answer_2),
                TaskElement.Text(value = Res.string.generics_task_1_answer_3),
                TaskElement.Text(value = Res.string.generics_task_1_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_2_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_2_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_2_answer_2),
                TaskElement.Text(value = Res.string.generics_task_2_answer_3),
                TaskElement.Text(value = Res.string.generics_task_2_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_3_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_3_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_3_answer_2),
                TaskElement.Text(value = Res.string.generics_task_3_answer_3),
                TaskElement.Text(value = Res.string.generics_task_3_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_4_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_4_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_4_answer_2),
                TaskElement.Text(value = Res.string.generics_task_4_answer_3),
                TaskElement.Text(value = Res.string.generics_task_4_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_5_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_5_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_5_answer_2),
                TaskElement.Text(value = Res.string.generics_task_5_answer_3),
                TaskElement.Text(value = Res.string.generics_task_5_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_6_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_6_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_6_answer_2),
                TaskElement.Text(value = Res.string.generics_task_6_answer_3),
                TaskElement.Text(value = Res.string.generics_task_6_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_7_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_7_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_7_answer_2),
                TaskElement.Text(value = Res.string.generics_task_7_answer_3),
                TaskElement.Text(value = Res.string.generics_task_7_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_8_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_8_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_8_answer_2),
                TaskElement.Text(value = Res.string.generics_task_8_answer_3),
                TaskElement.Text(value = Res.string.generics_task_8_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_9_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_9_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_9_answer_2),
                TaskElement.Text(value = Res.string.generics_task_9_answer_3),
                TaskElement.Text(value = Res.string.generics_task_9_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_10_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_10_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_10_answer_2),
                TaskElement.Text(value = Res.string.generics_task_10_answer_3),
                TaskElement.Text(value = Res.string.generics_task_10_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_11_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_11_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_11_answer_2),
                TaskElement.Text(value = Res.string.generics_task_11_answer_3),
                TaskElement.Text(value = Res.string.generics_task_11_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_12_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_12_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_12_answer_2),
                TaskElement.Text(value = Res.string.generics_task_12_answer_3),
                TaskElement.Text(value = Res.string.generics_task_12_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_13_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_13_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_13_answer_2),
                TaskElement.Text(value = Res.string.generics_task_13_answer_3),
                TaskElement.Text(value = Res.string.generics_task_13_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_14_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_14_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_14_answer_2),
                TaskElement.Text(value = Res.string.generics_task_14_answer_3),
                TaskElement.Text(value = Res.string.generics_task_14_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_15_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_15_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_15_answer_2),
                TaskElement.Text(value = Res.string.generics_task_15_answer_3),
                TaskElement.Text(value = Res.string.generics_task_15_answer_4)
            )
        ),
        TaskDefinition.SingleChoice(
            category = Category.GENERIC_PROGRAMMING,
            description = TaskElement.Text(value = Res.string.generics_task_16_description),
            correctAnswer = TaskElement.Text(value = Res.string.generics_task_16_answer_1),
            answers = listOf(
                TaskElement.Text(value = Res.string.generics_task_16_answer_2),
                TaskElement.Text(value = Res.string.generics_task_16_answer_3),
                TaskElement.Text(value = Res.string.generics_task_16_answer_4)
            )
        )
        //endregion

    )

}