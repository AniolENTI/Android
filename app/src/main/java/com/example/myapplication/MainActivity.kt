package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.widget.doBeforeTextChanged
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    val startText: TextView by lazy { findViewById(R.id.start_screen_text) }
    val button: Button by lazy { findViewById(R.id.start_screen_button) }
    val editText: EditText by lazy { findViewById(R.id.start_screen_editText) }
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

        val text: TextView = findViewById(R.id.start_screen_text)
        text.text = "Funciona"


        button.setOnClickListener{
            counter ++
            startText.text = counter.toString()
        }
        /*
        editText.doBeforeTextChanged{ text, start, count, after ->
            when(text?.length){
                2 -> editText.setTextColor(())
            }
        }
        */
    }
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