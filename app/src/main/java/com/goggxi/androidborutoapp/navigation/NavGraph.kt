package com.goggxi.androidborutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.goggxi.androidborutoapp.presentation.screen.home.HomeScreen
import com.goggxi.androidborutoapp.presentation.screen.splash.SplashScreen
import com.goggxi.androidborutoapp.presentation.screen.welcome.WelcomeScreen
import com.goggxi.androidborutoapp.utils.Constant.DETAILS_ARGUMENT_KEY
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Details.route, arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY) {
            type = NavType.IntType
        })) {

        }
        composable(route = Screen.Search.route) {

        }
    }
}