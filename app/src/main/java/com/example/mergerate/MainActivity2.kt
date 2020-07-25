package com.example.mergerate

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.concurrent.thread

class MainActivity2 : AppCompatActivity() {
    var clickedOne = false
    var clickedTwo = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.DarkTheme)
        setTitle("Scientific Ranking")
        setContentView(R.layout.activity_main2)
        textViewTest.setText("")

        //Get the button pressed from last activity
        val movie = intent.getStringExtra("movie")

        //if the star wars button was pressed
        if (movie.equals("StarWars")) {
            val numbers = listOf("sw_1", "sw_2", "sw_3", "sw_4", "sw_5", "sw_6", "sw_7", "sw_8",
                                 "sw_9", "sw_ro", "sw_so")
            runThread(numbers)
        }

        //if the harry potter button was pressed
        if (movie.equals("HarryPotter")) {
            val numbers = listOf("hp_1", "hp_2", "hp_3", "hp_4", "hp_5", "hp_6", "hp_7", "hp_8")
            runThread(numbers)
        }

        //if the Pirates button was pressed
        if (movie.equals("Pirates")) {
            val numbers = listOf("pc_1", "pc_2", "pc_3", "pc_4", "pc_5")
            runThread(numbers)
        }

        //if the Marvel button was pressed
        if (movie.equals("Marvel")) {
            val numbers = listOf("mu_1", "mu_2", "mu_3", "mu_4", "mu_5", "mu_6", "mu_7", "mu_8",
                                 "mu_9", "mu_10", "mu_11", "mu_12", "mu_13", "mu_14", "mu_15",
                                 "mu_16", "mu_17", "mu_18", "mu_19", "mu_20", "mu_21", "mu_22",
                                 "mu_23")
            runThread(numbers)
        }

        //if the DC button was pressed
        if (movie.equals("DC")) {
            val numbers = listOf("dc_1", "dc_2", "dc_3", "dc_4", "dc_5", "dc_6", "dc_7", "dc_8")
            runThread(numbers)
        }

        //if the Lord of the Rings button was pressed
        if (movie.equals("LR")) {
            val numbers = listOf("lr_1", "lr_2", "lr_3", "lr_4", "lr_5", "lr_6")
            runThread(numbers)
        }
    }

    fun runThread(numbers: List<String>) {
        thread(start = true) {
            val sortedList = mergeSort(numbers)
            runOnUiThread {
                textViewTest.setText(sortedList.toString())
            }

            val intent = Intent(this, Results::class.java)
            intent.putStringArrayListExtra("rating", ArrayList(sortedList))
            startActivity(intent)
        }
    }

    fun mergeSort(list: List<String>): List<String> {
        if (list.size <= 1) {
            return list
        }

        val middle = list.size / 2
        var left = list.subList(0,middle);
        var right = list.subList(middle,list.size);

        return merge(mergeSort(left), mergeSort(right))
    }

    fun merge(left: List<String>, right: List<String>): List<String>  {
        var indexLeft = 0
        var indexRight = 0
        var newList : MutableList<String> = mutableListOf()

        runOnUiThread {
            textViewTest.setText(left[indexLeft] + " or " + right[indexRight])
        }

        val imageOptionOne = findViewById<ImageButton>(R.id.imageButtonOne)
        imageOptionOne.setOnClickListener {
            this.clickedOne = true
        }

        val imageOptionTwo = findViewById<ImageButton>(R.id.imageButtonTwo)
        imageOptionTwo.setOnClickListener {
            this.clickedTwo = true
        }

        while (indexLeft < left.count() && indexRight < right.count()) {
            runOnUiThread {
                val id1 = resources.getIdentifier(left[indexLeft], "drawable", packageName)
                imageOptionOne.setImageResource(id1)
                val id2 = resources.getIdentifier(right[indexRight], "drawable", packageName)
                imageOptionTwo.setImageResource(id2)
                textViewTest.setText(left[indexLeft] + " or " + right[indexRight])
            }

            while (!clickedOne && !clickedTwo) {
                print("waiting for option")
            }

            if (clickedOne) {
                clickedOne = false
                clickedTwo = false
                newList.add(left[indexLeft])
                indexLeft++
            } else if (clickedTwo) {
                clickedTwo = false
                clickedOne = false
                newList.add(right[indexRight])
                indexRight++
            }
        }

        while (indexLeft < left.size) {
            newList.add(left[indexLeft])
            indexLeft++
        }

        while (indexRight < right.size) {
            newList.add(right[indexRight])
            indexRight++
        }
        return newList;
    }
}
