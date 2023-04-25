package com.notdo.feature_ui_main.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.feature_ui_main.ui.MainScreen
import com.notdo.navigator.NotDoRoutes

fun NavGraphBuilder.mainNavigator(
    navController: NavController
) {
    navigation(
        startDestination = NotDoRoutes.Main.MAIN_SCREEN,
        route = NotDoRoutes.MAIN_ROUTE
    ) {
        composable(
            route = NotDoRoutes.Main.MAIN_SCREEN
        ) {
            MainScreen(navController = navController)
        }
    }
}