package com.notdo.feature_ui_signup.navigator

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.notdo.navigator.NotDoRoutes

fun NavGraphBuilder.signUpNavigator(
    navController: NavController
) {
    navigation(
        startDestination = NotDoRoutes.SignUp.AGREE_TERMS_SCREEN,
        route = NotDoRoutes.SIGNUP_ROUTE
    ) {
        composable(
            route = NotDoRoutes.SignUp.AGREE_TERMS_SCREEN
        ) {

        }

        composable(
            route = NotDoRoutes.SignUp.AGREE_TERMS_DETAIL_SCREEN
        ) {

        }

        composable(
            route = NotDoRoutes.SignUp.EMAIL_INPUT_SCREEN
        ) {

        }

        composable(
            route = NotDoRoutes.SignUp.EMAIL_CODE_CHECK_SCREEN
        ) {

        }

        composable(
            route = NotDoRoutes.SignUp.PASSWORD_INPUT_SCREEN
        ) {

        }
    }
}