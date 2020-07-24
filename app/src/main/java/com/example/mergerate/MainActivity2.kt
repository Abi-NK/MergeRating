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

        val imageOptionOne = findViewById<ImageButton>(R.id.imageButtonOne)
        imageOptionOne.setOnClickListener {
            clickedOne = true
            textViewTest.setText(clickedOne.toString())
        }

        val imageOptionTwo = findViewById<ImageButton>(R.id.imageButtonOne)
        imageOptionTwo.setOnClickListener {
            clickedTwo = true
            textViewTest.setText(clickedTwo.toString())
        }

        //Get the button pressed from last activity
        val movie = intent.getStringExtra("movie")

        //if the star wars button was pressed
        if (movie.equals("StarWars")) {
            runStarWarsThread()
        }
    }

    fun runStarWarsThread() {
        thread(start = true) {
            val numbers = arrayOf<String>("3", "4", "2", "1")
            val temp = Array<String>(numbers.size) {"1"}

            val sortedList = mergeSort(numbers, temp, 0, numbers.size - 1)
            println("Unsorted: $numbers")
            println("Sorted: $sortedList")
        }
    }

    private fun mergeSort(array: Array<String>, temp: Array<String>, leftStart: Int, rightEnd: Int) {
        if (leftStart >= rightEnd) {
            return;
        }

        val middle = (leftStart + rightEnd) / 2
        mergeSort(array, temp, leftStart, middle)
        mergeSort(array, temp, middle + 1, rightEnd)
        mergeHalves(array, temp, leftStart, rightEnd)
    }

    private fun mergeHalves(array: Array<String>, temp: Array<String>, leftStart: Int, rightEnd: Int) {
        println("\nTESTBRUH")
        val leftEnd = (rightEnd +leftStart) / 2
        val rightStart = leftEnd + 1
        val size = rightEnd - leftStart + 1

        var left = leftStart
        var right = rightStart
        var index = leftStart

        while (!clickedOne && !clickedTwo) {
            println("Click a button.")
        }

        while (left <= leftEnd && right <= rightEnd) {
            println("\nTESTBRUH1")

            textViewTest.setText(array[left] + " or " + array[right])

            if (clickedOne) {
                clickedOne = false
                println("\nTESTBRUH2")
                temp[index] = array[left]
                left++
            }

            if (clickedTwo) {
                clickedTwo = false
                println("\nTESTBRUH3")
                temp[index] = array[right]
                right++
            }
            index++
        }


        System.arraycopy(array, left, temp, index, leftEnd - left + 1)
        System.arraycopy(array, right, temp, index, rightEnd - right + 1)
        System.arraycopy(temp, leftStart, array, leftStart, size)
    }
}
