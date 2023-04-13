package com.notdo.aos.navigator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.notdo.feature_ui_intro.navigator.introNavigator
import com.notdo.feature_ui_signup.navigator.signUpNavigator
import com.notdo.navigator.NotDoRoutes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController, startDestination = NotDoRoutes.INTRO_ROUTE
            ) {
                introNavigator(navController = navController)

                signUpNavigator(navController = navController)
            }
        }
    }
}