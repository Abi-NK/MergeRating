package com.example.mergerate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.DarkTheme)
        setTitle("Scientific Ranking")
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageButton>(R.id.imageButtonStarWars)
        //val button = findViewById<Button>(R.id.buttonActivity)

        image.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }

    }
}