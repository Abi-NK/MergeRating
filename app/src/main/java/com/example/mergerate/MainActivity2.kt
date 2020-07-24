package com.example.mergerate

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
        textViewButton.setText("")



        //Get the button pressed from last activity
        val movie = intent.getStringExtra("movie")

        //if the star wars button was pressed
        if (movie.equals("StarWars")) {
            runStarWarsThread()
        }
    }

    fun runStarWarsThread() {
        thread(start = true) {
            val numbers = listOf("3", "4", "2", "1", "52", "7", "5", "8")
            val sortedList = mergeSort(numbers)
            runOnUiThread {
                textViewTest.setText(sortedList.toString())
            }
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
            textViewButton.setText("one")
        }

        val imageOptionTwo = findViewById<ImageButton>(R.id.imageButtonTwo)
        imageOptionTwo.setOnClickListener {
            this.clickedTwo = true
            textViewButton.setText("two")
        }

        while (indexLeft < left.count() && indexRight < right.count()) {
            runOnUiThread {
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
