package com.example.parktikum_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.parktikum_3.tugas_3.LoginScreen
import com.example.parktikum_3.ui.theme.Parktikum3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Parktikum3Theme {
                // Menampilkan halaman Login dari file tugas_3.kt
                LoginScreen()
            }
        }
    }
}