package dev.stephano.appue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.stephano.appue.presentation.auth.LoginScreen
import dev.stephano.appue.presentation.auth.RegisterScreen
import dev.stephano.appue.presentation.home.HomeScreen
import dev.stephano.appue.presentation.navigation.AppNavGraph
import dev.stephano.appue.ui.theme.AppUETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppUETheme {
                //LoginScreen()
                //RegisterScreen()
                AppNavGraph()
                //HomeScreen()
            }
        }
    }
}