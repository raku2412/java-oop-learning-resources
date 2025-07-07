package de.kuhlmann.raphael.exampreparation.core.model

data class CategorySelection(
    val category: Category,
    val isSelected: Boolean,
    val onChangeSelectionClick: () -> Unit
)
