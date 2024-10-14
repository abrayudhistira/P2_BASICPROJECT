package com.example.p2_basic_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.p2_basic_project.ui.theme.P2_BASIC_PROJECTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2_BASIC_PROJECTTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BasicLayout()
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.resourcedua), contentDescription = null)
        Text(text = "Login", style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold))
        Text(text = "Ini adalah halaman Login", style = TextStyle(fontSize = 15.sp))
        Text(text = "Nama", style = TextStyle(fontSize = 15.sp))
        Text(text = "Abra Yudhistira Rachmadi", style = TextStyle(fontSize = 15.sp, color = Color.Red))
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2_BASIC_PROJECTTheme {
        BasicLayout()
    }
}
