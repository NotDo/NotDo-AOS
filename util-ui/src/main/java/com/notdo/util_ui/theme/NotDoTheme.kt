package com.notdo.util_ui.theme


import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.notdo.util_ui.color.NotDoColor

@Composable
fun NotDoTheme(
    statusBarColor: Color = NotDoColor.White,
    navigationBarColor: Color = NotDoColor.White,
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(statusBarColor)
    systemUiController.setNavigationBarColor(navigationBarColor)
    content()
}