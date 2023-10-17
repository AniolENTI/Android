package com.example.myapplication

import android.app.AlertDialog
import android.content.Context
import android.content.SharedPreferences
import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
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
//import com.example.myapplication.Utils.SharedPreferencesManager
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    //val openTimesAppText by lazy { findViewById<TextView>(R.id.open_app_times_text) }
    val testBt by lazy { findViewById<Button>(R.id.test_bt) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

        //SharedPreferencesManager.TimesOpenApp++
        //openTimesAppText.text = SharedPreferencesManager.TimesOpenApp.toString()

        testBt.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sóc un Alert molt guai")
            builder.setMessage("Sóc el missatge d'un Alert molt guai")

            builder.setPositiveButton("OK") { dialog, which, -> dialog.dismiss()}
            builder.setNegativeButton("NO") { dialog, which, -> dialog.dismiss()}
            builder.setNeutralButton("NEUTRAL") { dialog, which, -> dialog.dismiss()}

            val options = arrayOf("Resposta 1", "Resposta 2", "Resposta 3", "Resposta 4")
            val selectedItems = booleanArrayOf(false, false, false ,false)

            //builder.setMultiChoiceItems(options, selectedItems) {dialog, which, isChecked -> selectedItems[which] = isChecked}

            builder.setOnCancelListener{
                val toast = Toast(this)
                toast.setText("Sóc un toast molt guai")
                toast.show()
            }

            val linear = LinearLayout(this)
            linear.orientation = LinearLayout.VERTICAL

            val input = EditText(this)
            input.hint = "Escriu aquí"

            val input2 = EditText(this)
            input2.hint = "Escriu aquí"

            linear.addView(input)
            linear.addView(input2)

            val dialog = builder.create()
            dialog.show()
        }
    }
}