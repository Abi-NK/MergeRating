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
        } else if (nameID.substring(0, 2).equals("mu")) {
            if (nameID.equals("mu_1")) {
                return "Iron Man"
            }
            if (nameID.equals("mu_2")) {
                return "The Incredible Hulk"
            }
            if (nameID.equals("mu_3")) {
                return "Iron Man 2"
            }
            if (nameID.equals("mu_4")) {
                return "Thor"
            }
            if (nameID.equals("mu_5")) {
                return "Captain America: The First Avenger"
            }
            if (nameID.equals("mu_6")) {
                return "The Avengers"
            }
            if (nameID.equals("mu_7")) {
                return "Iron Man 3"
            }
            if (nameID.equals("mu_8")) {
                return "Thor: The Dark World"
            }
            if (nameID.equals("mu_9")) {
                return "Captain America: The Winter Soldier"
            }
            if (nameID.equals("mu_10")) {
                return "Guardians Of The Galaxy"
            }
            if (nameID.equals("mu_11")) {
                return "Avengers: Age Of Ultron"
            }
            if (nameID.equals("mu_12")) {
                return "Ant-Man"
            }
            if (nameID.equals("mu_13")) {
                return "Captain America: Civil War"
            }
            if (nameID.equals("mu_14")) {
                return "Doctor Strange"
            }
            if (nameID.equals("mu_15")) {
                return "Guardians Of The Galaxy Vol.2"
            }
            if (nameID.equals("mu_16")) {
                return "Spider-Man: Homecoming"
            }
            if (nameID.equals("mu_17")) {
                return "Thor: Ragnarok"
            }
            if (nameID.equals("mu_18")) {
                return "Black Panther"
            }
            if (nameID.equals("mu_19")) {
                return "Avengers: Infinity War"
            }
            if (nameID.equals("mu_20")) {
                return "Ant-Man And The Wasp"
            }
            if (nameID.equals("mu_21")) {
                return "Captain Marvel"
            }
            if (nameID.equals("mu_22")) {
                return "Avengers: Endgame"
            }
            if (nameID.equals("mu_23")) {
                return "Spider-Man: Far From Home"
            }
        } else if (nameID.substring(0, 2).equals("dc")) {
            if (nameID.equals("dc_1")) {
                return "Man of Steel"
            }
            if (nameID.equals("dc_2")) {
                return "Batman v Superman"
            }
            if (nameID.equals("dc_3")) {
                return "Suicide Squad"
            }
            if (nameID.equals("dc_4")) {
                return "Wonder Woman"
            }
            if (nameID.equals("dc_5")) {
                return "Justice League"
            }
            if (nameID.equals("dc_6")) {
                return "Aquaman"
            }
            if (nameID.equals("dc_7")) {
                return "Shazam!"
            }
            if (nameID.equals("dc_8")) {
                return "Birds of Prey"
            }
        } else if (nameID.substring(0, 2).equals("lr")) {
            if (nameID.equals("lr_1")) {
                return "The Fellowship of the Ring"
            }
            if (nameID.equals("lr_2")) {
                return "The Two Towers"
            }
            if (nameID.equals("lr_3")) {
                return "The Return of the King"
            }
            if (nameID.equals("lr_4")) {
                return "An Unexpected Journey"
            }
            if (nameID.equals("lr_5")) {
                return "The Desolation of Smaug"
            }
            if (nameID.equals("lr_6")) {
                return "The Battle of the Five Armies"
            }
        }
        return ""
    }
}