package com.example.mergerate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Scientific Ranking")
        setContentView(R.layout.activity_main2)

        val movie = intent.getStringExtra("movie")
        print(movie + "hello")
        textView2.setText(movie).toString()




    }
}