package com.notdo.feature_ui_main.ui.component.dialog

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
    onClick: () -> Unit,
) {
    var text by remember {
        mutableStateOf("")
    }

    if (visible) {
        Dialog(
            onDismissRequest = {},
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .fillMaxHeight(0.51f)
                    .clip(RoundedCornerShape(10.dp))
                    .background(NotDoColor.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DialogComponent(text = text, onValueCange = { text = it }) {
                    onClick()
                }
            }
        }
    }
}