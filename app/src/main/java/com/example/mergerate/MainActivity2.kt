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
            runStarWarsThread()
        }
    }

    fun runStarWarsThread() {
        thread(start = true) {
            val numbers = listOf("sw_1", "sw_2", "sw_3", "sw_4", "sw_5", "sw_6", "sw_7", "sw_8", "sw_9", "sw_ro", "sw_so")
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
