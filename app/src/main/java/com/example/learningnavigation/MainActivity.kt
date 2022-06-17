package com.example.learningnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.learningnavigation.navigations.nav_graph.SetupNavGraph
import com.example.learningnavigation.ui.theme.LearningNavigationTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningNavigationTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}
