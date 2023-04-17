package com.notdo.feature_ui_intro.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.feature_ui_intro.ui.IntroScreen
import com.notdo.navigator.NotDoRoutes

fun NavGraphBuilder.introNavigator(
    navController: NavController
) {
    navigation(
        startDestination = NotDoRoutes.Intro.MAIN_SCREEN,
        route = NotDoRoutes.INTRO_ROUTE
    ) {
        composable(
            route = NotDoRoutes.Intro.MAIN_SCREEN
        ) {
            IntroScreen(
                navController = navController
            )
        }
    }
}