package com.notdo.feature_ui_main.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.notdo.util_ui.color.NotDoColor


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TodoInputDialog(
    visible: Boolean,
    onDismissRequest: () -> Unit,
) {
    var text by remember {
        mutableStateOf("")
    }

    if (visible) {
        Dialog(
            onDismissRequest = { onDismissRequest() },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(415.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(NotDoColor.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DialogComponent(text = text) {
                    text = it
                }
            }
        }
    }
}