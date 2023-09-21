package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cl = findViewById<Button>(R.id.button)
        val te = findViewById<TextView>(R.id.textView)
        var counter = 0
        cl.setOnClickListener {
            counter += 1
            te.text = counter.toString()

        }
    }
}



