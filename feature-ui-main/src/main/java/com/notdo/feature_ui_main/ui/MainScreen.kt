package com.notdo.feature_ui_main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.notdo.feature_ui_main.ui.component.TodoInputDialog

@Composable
fun MainScreen(navController: NavController) {
    var visible by remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TodoInputDialog(visible = visible) {
            visible = false
        }
    }
}