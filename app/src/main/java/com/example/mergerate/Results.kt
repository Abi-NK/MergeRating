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

        val array = intent.getStringArrayListExtra("rating")
        var rating = ""
        var position = 1
        if (array != null) {
            for (i in array) {
                val movieName = getName(i)
                rating = "$rating$position. $movieName\n"
                position++
            }
        }
        textViewRating.setText(rating)
    }

    fun getName(nameID: String):String {
        if (nameID.substring(0, 2).equals("sw")) {
            if (nameID.equals("sw_1")) {
                return "The Phantom Menace"
            }
            if (nameID.equals("sw_2")) {
                return "Attack Of The Clones"
            }
            if (nameID.equals("sw_3")) {
                return "Revenge Of The Sith"
            }
            if (nameID.equals("sw_4")) {
                return "A New Hope"
            }
            if (nameID.equals("sw_5")) {
                return "Empire Strikes Back"
            }
            if (nameID.equals("sw_6")) {
                return "Return Of The Jedi"
            }
            if (nameID.equals("sw_7")) {
                return "The Force Awakens"
            }
            if (nameID.equals("sw_8")) {
                return "The Last Jedi"
            }
            if (nameID.equals("sw_9")) {
                return "The Rise Of Skywalker"
            }
            if (nameID.equals("sw_ro")) {
                return "Rogue One"
            }
            if (nameID.equals("sw_so")) {
                return "Solo"
            }
        } else if (nameID.substring(0, 2).equals("hp")) {
            if (nameID.equals("hp_1")) {
                return "The Philosopher's Stone"
            }
            if (nameID.equals("hp_2")) {
                return "The Chamber Of Secrets"
            }
            if (nameID.equals("hp_3")) {
                return "The Prisoner of Azkaban"
            }
            if (nameID.equals("hp_4")) {
                return "The Goblet Of Fire"
            }
            if (nameID.equals("hp_5")) {
                return "The Order Of the Phoenix"
            }
            if (nameID.equals("hp_6")) {
                return "The Half-Blood Prince"
            }
            if (nameID.equals("hp_7")) {
                return "The Deathly Hallows Part 1"
            }
            if (nameID.equals("hp_8")) {
                return "The Deathly Hallows Part 2"
            }
        } else if (nameID.substring(0, 2).equals("pc")) {
            if (nameID.equals("pc_1")) {
                return "The Curse Of The Black Pearl"
            }
            if (nameID.equals("pc_2")) {
                return "Dead Man's Chest"
            }
            if (nameID.equals("pc_3")) {
                return "At World's End"
            }
            if (nameID.equals("pc_4")) {
                return "On Stranger Tides"
            }
            if (nameID.equals("pc_5")) {
                return "Dead Men Tell No Tales"
            }
        }
        return ""
    }
}