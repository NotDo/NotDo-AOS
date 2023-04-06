package com.notdo.feature_ui_intro.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.feature_ui_intro.IntroScreen

fun NavGraphBuilder.introNavigation(
    navController: NavController
) {
    navigation(
        startDestination = "INTRO/screen",
        route = "INTRO/intro"
    ) {
        composable(
            route = "INTRO/screen",
        ) {
            IntroScreen(
                navController = navController,
            )
        }
    }
}