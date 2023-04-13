package com.notdo.feature_ui_signup.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.notdo.navigator.NotDoRoutes
import com.notdo.util_ui.component.NormalHeader

@Composable
fun AgreeTermsScreen(navController: NavController) {
    NormalHeader(title = "회원가입") {
        navController.navigate(NotDoRoutes.INTRO_ROUTE)
    }
}