package com.notdo.feature_ui_findpassword.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.feature_ui_findpassword.ui.EmailCodeCheckScreen
import com.notdo.feature_ui_findpassword.ui.EmailInputScreen
import com.notdo.feature_ui_findpassword.ui.ResetPasswordScreen
import com.notdo.navigator.NotDoRoutes

fun NavGraphBuilder.findPasswordNavigator(
    navController: NavController
) {
    navigation(
        startDestination = NotDoRoutes.FindPassword.EMAIL_INPUT_SCREEN,
        route = NotDoRoutes.FIND_PASSWORD_ROUTE
    ) {
        composable(
            route = NotDoRoutes.FindPassword.EMAIL_INPUT_SCREEN
        ) {
            EmailInputScreen(
                navController = navController
            )
        }

        composable(
            route = NotDoRoutes.FindPassword.EMAIL_CODE_CHECK_SCREEN
        ) {
            EmailCodeCheckScreen(
                navController = navController
            )
        }

        composable(
            route = NotDoRoutes.FindPassword.RESET_PASSWORD_SCREEN
        ) {
            ResetPasswordScreen(
                navController = navController
            )
        }
    }
}