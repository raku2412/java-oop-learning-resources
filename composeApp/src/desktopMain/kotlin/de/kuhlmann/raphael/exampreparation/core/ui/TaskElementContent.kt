package de.kuhlmann.raphael.exampreparation.core.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.kuhlmann.raphael.exampreparation.core.model.TaskElement
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

enum class TaskElementPrefixArrangement {
    START,
    TOP
}

@Composable
fun TaskElementContent(
    modifier: Modifier = Modifier,
    prefix: String,
    arrangement: TaskElementPrefixArrangement = TaskElementPrefixArrangement.START,
    taskElement: TaskElement
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
    ) {
        if (arrangement == TaskElementPrefixArrangement.START) {
            Text(
                text = prefix,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Column(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (arrangement == TaskElementPrefixArrangement.TOP) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = prefix,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            when (taskElement) {
                is TaskElement.Text -> {
                    Text(
                        text = stringResource(taskElement.value),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }

                is TaskElement.TextWithImage -> {
                    Text(
                        text = stringResource(taskElement.text),
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Image(
                        modifier = Modifier.size(150.dp),
                        painter = painterResource(taskElement.image),
                        contentDescription = null
                    )
                }

                is TaskElement.Image -> {
                    Image(
                        modifier = Modifier.size(150.dp),
                        painter = painterResource(taskElement.value),
                        contentDescription = null
                    )
                }
            }
        }
    }

}