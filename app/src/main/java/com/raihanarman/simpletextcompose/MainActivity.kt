package com.raihanarman.simpletextcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.raihanarman.simpletextcompose.ui.theme.SimpleTextComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingButton()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun GreetingButton(){
    Button(onClick = {  }) {
        Greeting(name = "button")
        Greeting(name = "kevin")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingButton()
}