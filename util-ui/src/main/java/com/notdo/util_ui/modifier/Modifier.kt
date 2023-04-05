package com.notdo.util_ui.modifier

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.unit.dp
import com.notdo.util_ui.color.NotDoColor


@OptIn(ExperimentalFoundationApi::class)
fun Modifier.notDoClickable(
    onClick: (() -> Unit)?
) = composed {
    combinedClickable(
        onClick = { if (onClick != null) onClick() },
        interactionSource = remember { MutableInteractionSource() },
        indication = rememberRipple(
            radius = 10.dp,
            color = NotDoColor.Gray500,
        ).takeIf {
            true
        }
    )
}