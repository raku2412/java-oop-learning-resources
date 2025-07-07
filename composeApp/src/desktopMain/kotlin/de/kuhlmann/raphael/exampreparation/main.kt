package de.kuhlmann.raphael.exampreparation

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import de.kuhlmann.raphael.exampreparation.core.ui.MainScreen
import exampreparation.composeapp.generated.resources.Res
import exampreparation.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = stringResource(Res.string.app_name),
    ) {
        MaterialTheme {
            MainScreen()
        }
    }
}