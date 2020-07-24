package com.example.mergerate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_results.*

class Results : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.DarkTheme)
        setTitle("Scientific Ranking")
        setContentView(R.layout.activity_results)
        textViewRating.setText(" ")

        val starwars_movies: Array<Array<String>> = arrayOf(
            arrayOf("sw_1", "sw_2", "sw_3", "sw_4", "sw_5", "sw_6", "sw_7", "sw_8", "sw_9", "sw_ro", "sw_so"),
            arrayOf("The Phantom Menace", "Attack Of The Clones", "Revenge Of The Sith",
                    "A New Hope", "Empire Strikes Back", "Return Of The Jedi", "The Force Awakens",
                    "The Last Jedi", "The Rise Of Skywalker", "Rogue One", "Solo")
        )

        val array = intent.getStringArrayListExtra("rating")
        println("\n\n\nArray is: " + array.toString() + "\n\n.")
        var counter = 0
        var rating = ""
        var position = 1
        if (array != null) {
            for (i in array) {
                if (i.equals(starwars_movies[0][counter])) {
                    println("Rating: " + rating)
                    rating = rating + position + ". " + starwars_movies[1][counter] + "\n"
                }
                counter++
                position++
            }
        }

        textViewRating.setText(rating)
    }
}