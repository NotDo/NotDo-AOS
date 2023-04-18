package com.notdo.feature_ui_signin.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.feature_ui_signin.ui.SignInScreen
import com.notdo.navigator.NotDoRoutes

fun NavGraphBuilder.signInNavigator(
    navController: NavController
) {
    navigation(
        startDestination = NotDoRoutes.SignIn.SIGNIN_SCREEN,
        route = NotDoRoutes.SIGNIN_ROUTE
    ) {
        composable(
            route = NotDoRoutes.SignIn.SIGNIN_SCREEN
        ) {
            SignInScreen(navController = navController)
        }
    }
}