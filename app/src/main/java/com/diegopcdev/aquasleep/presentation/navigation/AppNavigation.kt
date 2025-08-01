package com.diegopcdev.aquasleep.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diegopcdev.aquasleep.presentation.screens.timer.TimerScreen
import com.diegopcdev.aquasleep.presentation.screens.timer.TimerViewModel

object Routes {
    const val TIMER_SCREEN = "timer_screen"
    // Add other routes here
}

@Composable
fun AppNavigation(shouldExtendTimer: Boolean = false) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.TIMER_SCREEN) {
        composable(Routes.TIMER_SCREEN) {
            val viewModel: TimerViewModel = hiltViewModel()
            TimerScreen(
                viewModel = viewModel,
                shouldExtendTimer = shouldExtendTimer
            )
        }
        // Add other composables/screens here
    }
}
