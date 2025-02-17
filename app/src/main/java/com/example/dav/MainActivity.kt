package com.example.dav

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Access UI elements
        val welcomeText: TextView = findViewById(R.id.welcomeText)
        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            welcomeText.text = "Game Started!"
        }
    }
}
