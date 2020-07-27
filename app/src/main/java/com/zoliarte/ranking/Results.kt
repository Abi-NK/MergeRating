package com.zoliarte.ranking

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_results.*

class Results : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.DarkTheme)
        setTitle("Scientific Ranking")
        setContentView(R.layout.activity_results)
        textViewRating.setText(" ")
        val twitter = findViewById<ImageButton>(R.id.imageButtonTwitter)
        val insta = findViewById<ImageButton>(R.id.imageButtonInsta)

        val mov = Movies()
        val array = intent.getStringArrayListExtra("rating")
        var rating = ""
        var position = 1
        if (array != null) {
            for (i in array) {
                val movieName = mov.getName(i)
                rating = "$rating$position. $movieName\n"
                position++
            }
        }
        textViewRating.setText(rating)

        twitter.setOnClickListener {
            var intent: Intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://twitter.com/ZoliArte"))
            startActivity(intent)
        }

        insta.setOnClickListener {
            var intent: Intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://www.instagram.com/zoliarte/"))
            startActivity(intent)
        }

    }


    @Override
    public override fun onBackPressed() {
        super.onBackPressed()
        this.finish()
    }
}
