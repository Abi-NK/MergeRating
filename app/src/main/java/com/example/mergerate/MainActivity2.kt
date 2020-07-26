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

        //if the Fast and Furious button was pressed
        if (movie.equals("FF")) {
            val numbers = listOf("ff_1", "ff_2", "ff_3", "ff_4", "ff_5", "ff_6", "ff_7", "ff_8", "ff_9")
            runThread(numbers)
        }

        //if the Pixar button was pressed
        if (movie.equals("PX")) {
            val numbers = listOf("px_1", "px_2", "px_3", "px_4", "px_5", "px_6", "px_7", "px_8",
                                 "px_9", "px_10", "px_11", "px_12", "px_13", "px_14", "px_15",
                                 "px_16", "px_17", "px_18", "px_19", "px_20", "px_21", "px_22")
            runThread(numbers)
        }

        //if the James Bond button was pressed
        if (movie.equals("JB")) {
            val numbers = listOf("jb_1", "jb_2", "jb_3", "jb_4", "jb_5")
            runThread(numbers)
        }

        //if the Transformers button was pressed
        if (movie.equals("TF")) {
            val numbers = listOf("tf_1", "tf_2", "tf_3", "tf_4", "tf_5", "tf_6")
            runThread(numbers)
        }

        //if the X-Men button was pressed
        if (movie.equals("XM")) {
            val numbers = listOf("xm_1", "xm_2", "xm_3", "xm_4", "xm_5", "xm_6", "xm_7", "xm_8",
                                 "xm_9", "xm_10", "xm_11", "xm_12", "xm_13")
            runThread(numbers)
        }

        //if the Jurassic Park button was pressed
        if (movie.equals("JP")) {
            val numbers = listOf("jp_1", "jp_2", "jp_3", "jp_4", "jp_5")
            runThread(numbers)
        }

        //if the Mission Impossible button was pressed
        if (movie.equals("MI")) {
            val numbers = listOf("mi_1", "mi_2", "mi_3", "mi_4", "mi_5", "mi_6")
            runThread(numbers)
        }

        //if the Indiana Jones button was pressed
        if (movie.equals("IJ")) {
            val numbers = listOf("ij_1", "ij_2", "ij_3", "ij_4")
            runThread(numbers)
        }

        //if the Terminator button was pressed
        if (movie.equals("TM")) {
            val numbers = listOf("tm_1", "tm_2", "tm_3", "tm_4", "tm_5", "tm_6")
            runThread(numbers)
        }

        //if the Alien button was pressed
        if (movie.equals("AL")) {
            val numbers = listOf("al_1", "al_2", "al_3", "al_4", "al_5", "al_6")
            runThread(numbers)
        }

        //if the Dreamworks button was pressed
        if (movie.equals("DW")) {
            val numbers = listOf("dw_1", "dw_2", "dw_3", "dw_4", "dw_5", "dw_6", "dw_7", "dw_8",
                                 "dw_9", "dw_10", "dw_11", "dw_12", "dw_13", "dw_14", "dw_15",
                                 "dw_16", "dw_17", "dw_18", "dw_19", "dw_20", "dw_21", "dw_22",
                                 "dw_23", "dw_24", "dw_25", "dw_26", "dw_27", "dw_28", "dw_29",
                                 "dw_30", "dw_31", "dw_32", "dw_33", "dw_34", "dw_35", "dw_36",
                                 "dw_37", "dw_38")
            runThread(numbers)
        }

        //if the Conjuring button was pressed
        if (movie.equals("CJ")) {
            val numbers = listOf("cj_1", "cj_2", "cj_3", "cj_4", "cj_5", "cj_6", "cj_7")
            runThread(numbers)
        }

        //if the Bourne button was pressed
        if (movie.equals("BO")) {
            val numbers = listOf("bo_1", "bo_2", "bo_3", "bo_4", "bo_5")
            runThread(numbers)
        }

        //if the Rocky button was pressed
        if (movie.equals("RK")) {
            val numbers = listOf("rk_1", "rk_2", "rk_3", "rk_4", "rk_5", "rk_6", "rk_7", "rk_8")
            runThread(numbers)
        }

        //if the Die Hard button was pressed
        if (movie.equals("DH")) {
            val numbers = listOf("dh_1", "dh_2", "dh_3", "dh_4", "dh_5")
            runThread(numbers)
        }

        //if the Twilight button was pressed
        if (movie.equals("TW")) {
            val numbers = listOf("tw_1", "tw_2", "tw_3", "tw_4", "tw_5")
            runThread(numbers)
        }

        //if the Nolan button was pressed
        if (movie.equals("CN")) {
            val numbers = listOf("cn_1", "cn_2", "cn_3", "cn_4", "cn_5", "cn_6", "cn_7", "cn_8", "cn_9", "cn_10")
            runThread(numbers)
        }

        //if the Villeneuve button was pressed
        if (movie.equals("DV")) {
            val numbers = listOf("dv_1", "dv_2", "dv_3", "dv_4", "dv_5", "dv_6", "dv_7")
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
