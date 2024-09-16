package com.example.androidcourse

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //variable
    //var wellcomeTv : TextView? = null
    lateinit var wellcomeTv : TextView    // two type of solve   samone lateinit
    lateinit var nameEt : EditText
    lateinit var showBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wellcomeTv = findViewById(R.id.textTv)
        nameEt = findViewById(R.id.editTextText)
        showBtn = findViewById(R.id.button)


        showBtn.setOnClickListener {
            var result = nameEt.getText().toString()
            wellcomeTv.setText(result).toString()

        }

    }
}