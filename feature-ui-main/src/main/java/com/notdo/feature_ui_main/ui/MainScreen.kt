package com.notdo.feature_ui_main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.notdo.feature_ui_main.ui.component.TodayDoBar
import com.notdo.feature_ui_main.ui.component.TodoInputDialog

@Composable
fun MainScreen(navController: NavController) {
    var visible by remember {
        mutableStateOf(true)
    }

    TodoInputDialog(visible = visible) {
        //TODO 로컬 저장 로직
        visible = false
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TodayDoBar()
    }
}