package com.example.mergerate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.DarkTheme)
        setTitle("Scientific Ranking")
        setContentView(R.layout.activity_main)

        val imageStarWars = findViewById<ImageButton>(R.id.imageButtonStarWars)
        val imageHarryPotter = findViewById<ImageButton>(R.id.imageButtonHarryPotter)
        val imagePirates = findViewById<ImageButton>(R.id.imageButtonPirates)
        val imageMarvel = findViewById<ImageButton>(R.id.imageButtonMarvel)
        val imageDC = findViewById<ImageButton>(R.id.imageButtonDC)
        val imageLR = findViewById<ImageButton>(R.id.imageButtonLordRings)

        imageStarWars.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "StarWars"
            intent.putExtra("movie", movie)
            startActivity(intent)
        }

        imageHarryPotter.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "HarryPotter"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imagePirates.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "Pirates"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageMarvel.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "Marvel"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageDC.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "DC"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageLR.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "LR"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

    }
}