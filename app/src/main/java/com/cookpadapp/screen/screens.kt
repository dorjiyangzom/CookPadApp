package com.cookpadapp.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

//app navigation

@Composable
fun AppNavigation(){
    //retrieve navController
    val navController = rememberNavController()

    NavHost(navController, startDestination = "home") {
        composable("home"){ HomeScreen(navController) }
        composable("second") { SecondScreen(navController) }
    }

}

//define screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier){
    val context = LocalContext.current
    Scaffold(topBar = { TopAppBar(title = { Text("Home Screen")}) }) {
       padding ->
        Column(modifier.fillMaxSize().padding(padding).padding(16.dp)) {
            Button(onClick = {
                Toast.makeText(context,"Home Button is clicked.", Toast.LENGTH_SHORT).show()
            }) { Text("Click Me") }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController, modifier: Modifier = Modifier){
    val context = LocalContext.current
    Scaffold(topBar = { TopAppBar(title = { Text("Second Screen")}) }) {
            padding ->
        Column(modifier.fillMaxSize().padding(padding).padding(16.dp)) {
            Button(onClick = {
                Toast.makeText(context,"Second Button is clicked.", Toast.LENGTH_SHORT).show()
            }) { Text("Click Me") }
        }
    }

}