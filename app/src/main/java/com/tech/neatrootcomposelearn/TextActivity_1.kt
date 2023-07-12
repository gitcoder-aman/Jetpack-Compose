package com.tech.neatrootcomposelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tech.neatrootcomposelearn.ui.theme.NeatRootComposeLearnTheme

class TextActivity_1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeatRootComposeLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Text Widgets
                    Column {

                       ShowText()

                        val arr = arrayOf("fksjdahkasjdkfhsadcksdbajvnlasvkasdnvas lvaslkvhasvhaslvasvhlashvlahslvhdslvasvhlkashvasjvhasasdjsahdhdshdshash", "Kumar", "Neat", "Root")
                        Column {
                            for (name in arr)
                                Text(text = name, modifier = Modifier.padding(start = 20.dp), maxLines = 2)
                            
                            Text(text = "I Learn Jetpack Compose from Neat Roots..\n".repeat(20), modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }
        }
    }
    @Composable
    fun ShowText(){
        Row {
            Text(
                text = "Neat Roots",
                color = Color.Cyan,
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold,
                modifier =
                Modifier
                    .background(Color.White)
//                                .fillMaxWidth(.5f),
                    .width(100.dp)
                    .height(100.dp),
                textAlign = TextAlign.Center
            )
            Text(text = "Yt Neat Roots", color = Color.Red)
        }
    }
}