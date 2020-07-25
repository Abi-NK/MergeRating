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
        } else if (nameID.substring(0, 2).equals("ff")) {
            if (nameID.equals("ff_1")) {
                return "The Fast and the Furious"
            }
            if (nameID.equals("ff_2")) {
                return "2 Fast 2 Furious"
            }
            if (nameID.equals("ff_3")) {
                return "Tokyo Drift"
            }
            if (nameID.equals("ff_4")) {
                return "Fast & Furious"
            }
            if (nameID.equals("ff_5")) {
                return "Fast Five"
            }
            if (nameID.equals("ff_6")) {
                return "Fast & Furious 6"
            }
            if (nameID.equals("ff_7")) {
                return "Furious 7"
            }
            if (nameID.equals("ff_8")) {
                return "The Fate and the Furious"
            }
            if (nameID.equals("ff_9")) {
                return "Hobbs & Shaw"
            }
        } else if (nameID.substring(0, 2).equals("px")) {
            if (nameID.equals("px_1")) {
                return "Toy Story"
            }
            if (nameID.equals("px_2")) {
                return "A Bug's Life"
            }
            if (nameID.equals("px_3")) {
                return "Toy Story 2"
            }
            if (nameID.equals("px_4")) {
                return "Monster's Inc."
            }
            if (nameID.equals("px_5")) {
                return "Finding Nemo"
            }
            if (nameID.equals("px_6")) {
                return "The Incredibles"
            }
            if (nameID.equals("px_7")) {
                return "Cars"
            }
            if (nameID.equals("px_8")) {
                return "Ratatouille"
            }
            if (nameID.equals("px_9")) {
                return "WALL-E"
            }
            if (nameID.equals("px_10")) {
                return "Up"
            }
            if (nameID.equals("px_11")) {
                return "Toy Story 3"
            }
            if (nameID.equals("px_12")) {
                return "Cars 2"
            }
            if (nameID.equals("px_13")) {
                return "Brave"
            }
            if (nameID.equals("px_14")) {
                return "Monsters University"
            }
            if (nameID.equals("px_15")) {
                return "Inside Out"
            }
            if (nameID.equals("px_16")) {
                return "The Good Dinosaur"
            }
            if (nameID.equals("px_17")) {
                return "Finding Dory"
            }
            if (nameID.equals("px_18")) {
                return "Cars 3"
            }
            if (nameID.equals("px_19")) {
                return "Coco"
            }
            if (nameID.equals("px_20")) {
                return "Incredibles 2"
            }
            if (nameID.equals("px_21")) {
                return "Toy Story 4"
            }
            if (nameID.equals("px_22")) {
                return "Onward"
            }
        }
        return ""
    }
}