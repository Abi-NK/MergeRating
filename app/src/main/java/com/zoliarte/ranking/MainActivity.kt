package com.zoliarte.ranking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

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
        val imageFF = findViewById<ImageButton>(R.id.imageButtonFastFurious)
        val imagePX = findViewById<ImageButton>(R.id.imageButtonPixar)
        val imageJB = findViewById<ImageButton>(R.id.imageButtonJamesBond)
        val imageTF = findViewById<ImageButton>(R.id.imageButtonTransformers)
        val imageXM = findViewById<ImageButton>(R.id.imageButtonXMen)
        val imageJP = findViewById<ImageButton>(R.id.imageButtonJurassicPark)
        val imageMI = findViewById<ImageButton>(R.id.imageButtonMissionImpossible)
        val imageIJ = findViewById<ImageButton>(R.id.imageButtonIndianaJones)
        val imageTM = findViewById<ImageButton>(R.id.imageButtonTerminator)
        val imageAL = findViewById<ImageButton>(R.id.imageButtonAlien)
        val imageDW = findViewById<ImageButton>(R.id.imageButtonDreamworks)
        val imageCJ = findViewById<ImageButton>(R.id.imageButtonConjuring)
        val imageBO = findViewById<ImageButton>(R.id.imageButtonJasonBourne)
        val imageRK = findViewById<ImageButton>(R.id.imageButtonRocky)
        val imageDH = findViewById<ImageButton>(R.id.imageButtonDieHard)
        val imageTW = findViewById<ImageButton>(R.id.imageButtonTwilight)
        val imageCN = findViewById<ImageButton>(R.id.imageButtonNolan)
        val imageDV = findViewById<ImageButton>(R.id.imageButtonVilleneuve)

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

        imageFF.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "FF"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imagePX.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "PX"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageJB.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "JB"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageTF.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "TF"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageXM.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "XM"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageJP.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "JP"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageMI.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "MI"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageIJ.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "IJ"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageTM.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "TM"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageAL.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "AL"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageDW.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "DW"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageCJ.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "CJ"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageBO.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "BO"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageRK.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "RK"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageDH.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "DH"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageTW.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "TW"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageCN.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "CN"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

        imageDV.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val movie = "DV"
            intent.putExtra("movie", movie)
            startActivity(intent);
        }

    }
}