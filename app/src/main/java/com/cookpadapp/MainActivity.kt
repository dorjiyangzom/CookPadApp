package com.cookpadapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cookpadapp.ui.theme.CookPadAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            CookPadAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    LandingPage(
                        name = "Track. Cook. Enjoy.",
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun LandingPage(name: String, modifier: Modifier = Modifier) {
    Text(
        text =  "$name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun LandingPagePreview() {
    CookPadAppTheme {
        LandingPage("Track. Cook. Enjoy.")
    }
}

@Composable
fun HomePage(name: String, modifier: Modifier = Modifier) {
   Row(
       modifier = modifier.fillMaxSize()
   ){
       Column(modifier.fillMaxHeight().width(100.dp).background(Color.Cyan),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally){
           Text(text = "Column 1")
       }
       Column(modifier.fillMaxHeight().width(100.dp).background(Color.White),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally){
           Text(text = "Column 2")
       }
       Column(modifier.fillMaxHeight().fillMaxWidth().background(Color.Cyan),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally) {
           Text(text = "Column 3")
       }
   }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    HomePage("dfgh")
}