package com.example.androidcourse

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //variable
    //var wellcomeTv : TextView? = null
    lateinit var wellcomeTv : TextView    // two type of solve   samone lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wellcomeTv = findViewById(R.id.textTv)
        wellcomeTv.setText("Hi")

        wellcomeTv.setOnClickListener{
            wellcomeTv.setTextColor(Color.RED)


        }

    }
}