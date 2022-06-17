package com.example.learningnavigation.navigations.nav_graph

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.learningnavigation.navigations.DETAIL_ARGUMENTS_KEY_ID
import com.example.learningnavigation.navigations.DETAIL_ARGUMENTS_KEY_NAME
import com.example.learningnavigation.navigations.HOME_ROUTE
import com.example.learningnavigation.navigations.Screen
import com.example.learningnavigation.screens.DetailScreen
import com.example.learningnavigation.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route, arguments = listOf(navArgument(
                DETAIL_ARGUMENTS_KEY_ID
            ) {
                type = NavType.IntType
                defaultValue = 0
            }, navArgument(DETAIL_ARGUMENTS_KEY_NAME) {
                type = NavType.StringType
                defaultValue = "Alfa Sakan"
            })
        ) {
            Log.d("Args ID", it.arguments?.getInt(DETAIL_ARGUMENTS_KEY_ID).toString())
            Log.d("Args ID", it.arguments?.getString(DETAIL_ARGUMENTS_KEY_NAME).toString())
            DetailScreen(navController = navController)
        }
    }
}