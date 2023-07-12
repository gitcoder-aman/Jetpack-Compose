package com.tech.neatrootcomposelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tech.neatrootcomposelearn.ui.theme.NeatRootComposeLearnTheme

class LayoutActivity_2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NeatRootComposeLearnTheme {
                Layout()
            }
        }
    }
}

@Composable
@Preview
fun Layout() {
    /* Column(
         modifier = Modifier
 //        .fillMaxWidth(.5f)
 //        .fillMaxHeight(.5f)
             .fillMaxSize()
             .verticalScroll(rememberScrollState())
             .background(Color.Green),
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally
     ) {
         for (i in 1..5) {
             Text(text = "Neat Roots", fontSize = 28.sp)
         }
     }*/

    LazyColumn(
        content = {
            item {
                for (i in 1..50) {
                    Text(text = "Neat Roots", fontSize = 28.sp)
                }
            }
        }, modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        state = LazyListState(5, 10),
        contentPadding = PaddingValues(5.dp),
        horizontalAlignment = Alignment.Start,
    )
}
