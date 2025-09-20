package dev.stephano.appue.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.stephano.appue.presentation.auth.LoginScreen
import dev.stephano.appue.presentation.auth.RegisterScreen
import dev.stephano.appue.presentation.home.HomeScreen

@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "register"){

        composable (route="register"){ RegisterScreen(navController) }
        composable (route="login"){ LoginScreen(navController) }
        composable(route = "home") { HomeScreen(navController) }


    }


}


