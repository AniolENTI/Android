package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column()
                    {
                        PrintToScreen("Mondongo")
                        PrintToScreen("AAAAAAAAAAAAAAAAAAAAAAAA")

                        for(i in 1..5)
                        {
                            PrintToScreen("Perejil")
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        PrintToScreen("Hee Hee")

                        var names = listOf("Armando", "Bomba", "Cantimplora", "Robotin")

                        for(name in names)
                        {
                            PrintToScreen(name)
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun PrintToScreen(name: String, modifier: Modifier = Modifier) {

    var name = name ?: run {
        Log.e("NullError", "Name is Null")
        return
    }
    Text(
        text = "Hello ${name}!",
        modifier = modifier
    )
}

/*
@Composable
fun PrintToScreen(name: String?, name2: String?, modifier: Modifier = Modifier) {

    var name = name ?: run {
        Log.e("NullError", "Name is Null")
        return
    }
    var name2 = name2 ?: run {
        Log.e("NullError", "Name2 is Null")
        return
    }
    Text(
        text = "Hello ${name}! ${name2}",
        modifier = modifier
    )
}
*/