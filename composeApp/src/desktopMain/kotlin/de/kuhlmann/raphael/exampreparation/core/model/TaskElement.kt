package de.kuhlmann.raphael.exampreparation.core.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

sealed interface TaskElement {

    data class Text(val value: StringResource) : TaskElement

    data class Image(val value: DrawableResource) : TaskElement

    data class TextWithImage(
        val text: StringResource,
        val image: DrawableResource
    ) : TaskElement

}