package com.notdo.feature_ui_main.ui.component.todaydo

import androidx.compose.runtime.Composable
import com.notdo.util_ui.color.NotDoColor
import com.notdo.util_ui.font.NotDoFont

@Composable
fun TodayDo(text: String) {
    NotDoFont.Subtitle(
        text = text,
        color = NotDoColor.White
    )
}