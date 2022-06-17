package com.example.learningnavigation.navigations.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learningnavigation.navigations.AUTHENTICATION_ROUTE
import com.example.learningnavigation.navigations.Screen
import com.example.learningnavigation.screens.LoginScreen
import com.example.learningnavigation.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }
    }
}