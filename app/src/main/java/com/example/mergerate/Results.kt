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
        } else if (nameID.substring(0, 2).equals("jb")) {
            if (nameID.equals("jb_1")) {
                return "Casino Royale"
            }
            if (nameID.equals("jb_2")) {
                return "Quantum of Solace"
            }
            if (nameID.equals("jb_3")) {
                return "Skyfall"
            }
            if (nameID.equals("jb_4")) {
                return "Spectre"
            }
            if (nameID.equals("jb_5")) {
                return "No Time To Die"
            }
        } else if (nameID.substring(0, 2).equals("tf")) {
            if (nameID.equals("tf_1")) {
                return "Transformers"
            }
            if (nameID.equals("tf_2")) {
                return "Revenge of the Fallen"
            }
            if (nameID.equals("tf_3")) {
                return "Dark of the Moon"
            }
            if (nameID.equals("tf_4")) {
                return "Age of Extinction"
            }
            if (nameID.equals("tf_5")) {
                return "The Last Knight"
            }
            if (nameID.equals("tf_6")) {
                return "Bumblebee"
            }
        } else if (nameID.substring(0, 2).equals("xm")) {
            if (nameID.equals("xm_1")) {
                return "X-Men"
            }
            if (nameID.equals("xm_2")) {
                return "X2"
            }
            if (nameID.equals("xm_3")) {
                return "The Last Stand"
            }
            if (nameID.equals("xm_4")) {
                return "Origins: Wolverine"
            }
            if (nameID.equals("xm_5")) {
                return "First Class"
            }
            if (nameID.equals("xm_6")) {
                return "The Wolverine"
            }
            if (nameID.equals("xm_7")) {
                return "Days of Future Past"
            }
            if (nameID.equals("xm_8")) {
                return "Deadpool"
            }
            if (nameID.equals("xm_9")) {
                return "Apocalypse"
            }
            if (nameID.equals("xm_10")) {
                return "Logan"
            }
            if (nameID.equals("xm_11")) {
                return "Deadpool 2"
            }
            if (nameID.equals("xm_12")) {
                return "Dark Phoenix"
            }
            if (nameID.equals("xm_13")) {
                return "The New Mutants"
            }
        } else if (nameID.substring(0, 2).equals("jp")) {
            if (nameID.equals("jp_1")) {
                return "Jurassic Park"
            }
            if (nameID.equals("jp_2")) {
                return "The Lost World"
            }
            if (nameID.equals("jp_3")) {
                return "Jurassic Park 3"
            }
            if (nameID.equals("jp_4")) {
                return "Jurassic World"
            }
            if (nameID.equals("jp_5")) {
                return "Fallen Kingdom"
            }
        } else if (nameID.substring(0, 2).equals("mi")) {
            if (nameID.equals("mi_1")) {
                return "Mission: Impossible"
            }
            if (nameID.equals("mi_2")) {
                return "Mission: Impossible 2"
            }
            if (nameID.equals("mi_3")) {
                return "Mission: Impossible 3"
            }
            if (nameID.equals("mi_4")) {
                return "Mission: Impossible Ghost Protocol"
            }
            if (nameID.equals("mi_5")) {
                return "Mission: Impossible Rogue Nation"
            }
            if (nameID.equals("mi_6")) {
                return "Mission: Impossible Fallout"
            }
        } else if (nameID.substring(0, 2).equals("ij")) {
            if (nameID.equals("ij_1")) {
                return "Raiders of the Lost Ark"
            }
            if (nameID.equals("ij_2")) {
                return "The Temple of Doom"
            }
            if (nameID.equals("ij_3")) {
                return "The Last Crusade"
            }
            if (nameID.equals("ij_4")) {
                return "The Kingdom of the Crystal Skull"
            }
        } else if (nameID.substring(0, 2).equals("tm")) {
            if (nameID.equals("tm_1")) {
                return "The Terminator"
            }
            if (nameID.equals("tm_2")) {
                return "Judgement Day"
            }
            if (nameID.equals("tm_3")) {
                return "Rise of the Machines"
            }
            if (nameID.equals("tm_4")) {
                return "Salvation"
            }
            if (nameID.equals("tm_5")) {
                return "Genisys"
            }
            if (nameID.equals("tm_6")) {
                return "Dark Fate"
            }
        } else if (nameID.substring(0, 2).equals("al")) {
            if (nameID.equals("al_1")) {
                return "Alien"
            }
            if (nameID.equals("al_2")) {
                return "Aliens"
            }
            if (nameID.equals("al_3")) {
                return "Alien 3"
            }
            if (nameID.equals("al_4")) {
                return "Alien Resurrection"
            }
            if (nameID.equals("al_5")) {
                return "Prometheus"
            }
            if (nameID.equals("al_6")) {
                return "Alien: Covenant"
            }
        }
        return ""
    }
}