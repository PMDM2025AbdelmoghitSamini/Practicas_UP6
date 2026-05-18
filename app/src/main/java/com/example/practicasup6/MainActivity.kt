package com.example.practicasup6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.practicasup6.ui.theme.BusScheduleApp
import com.example.practicasup6.ui.theme.PracticasUP6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasUP6Theme {
                BusScheduleApp()
            }
        }
    }
}
