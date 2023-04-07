package com.notdo.feature_ui_intro.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.feature_ui_intro.IntroScreen
import com.notdo.navigator.NotDoRoutes

fun NavGraphBuilder.introNavigation(
    navController: NavController
) {
    navigation(
        startDestination = NotDoRoutes.Intro.MAIN,
        route = NotDoRoutes.INTRO
    ) {
        composable(
            route = NotDoRoutes.Intro.MAIN,
        ) {
            IntroScreen(
                navController = navController,
            )
        }
    }
}