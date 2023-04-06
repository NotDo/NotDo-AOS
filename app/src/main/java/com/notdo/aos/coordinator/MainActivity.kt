package com.notdo.aos.coordinator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.notdo.feature_ui_intro.navigator.introNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController, startDestination = "INTRO/intro"
            ) {
                this.introNavigation(navController = navController)
            }
        }
    }
}