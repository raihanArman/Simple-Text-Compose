package com.raihanarman.simpletextcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Text(text = "Hello $name!", modifier = Modifier
        .clickable {}
        .padding(start = 24.dp, )
        .width(200.dp)
        .height(240.dp),
    style = MaterialTheme.typography.h3,
    fontWeight = FontWeight.SemiBold
 )
}

@Composable
fun GreetingButton(){
    Button(onClick = {  }) {
        Greeting(name = "button")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    Greeting("Yoits")
}