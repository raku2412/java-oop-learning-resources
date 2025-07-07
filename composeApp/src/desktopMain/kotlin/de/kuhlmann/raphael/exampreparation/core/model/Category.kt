package de.kuhlmann.raphael.exampreparation.core.model

import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.category_arrays
import exampreparation.composeapp.generated.resources.category_enumerations
import exampreparation.composeapp.generated.resources.category_exception_handling
import exampreparation.composeapp.generated.resources.category_generic_programming
import exampreparation.composeapp.generated.resources.category_inheritance
import exampreparation.composeapp.generated.resources.category_interfaces
import exampreparation.composeapp.generated.resources.category_java_api
import exampreparation.composeapp.generated.resources.category_object_classes
import exampreparation.composeapp.generated.resources.category_polymorphism
import exampreparation.composeapp.generated.resources.category_program_structure
import org.jetbrains.compose.resources.StringResource

enum class Category(val title: StringResource) {
   OBJECT_CLASSES(Res.string.category_object_classes),
   PROGRAM_STRUCTURE(Res.string.category_program_structure),
   JAVA_API(Res.string.category_java_api),
   ARRAYS(Res.string.category_arrays),
   ENUMERATIONS(Res.string.category_enumerations),
   INHERITANCE(Res.string.category_inheritance),
   POLYMORPHISM(Res.string.category_polymorphism),
   EXCEPTION_HANDLING(Res.string.category_exception_handling),
   INTERFACES(Res.string.category_interfaces),
   GENERIC_PROGRAMMING(Res.string.category_generic_programming),
}