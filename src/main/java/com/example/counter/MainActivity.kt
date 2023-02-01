package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.awt.font.TextAttribute

class MainActivity : AppCompatActivity() {
    private var count = 0
    val doublebtn = findViewById<Button>(R.id.doublebtn)
 
        doublebtn.setOnClickListener {
            count = count * 2
            counter.text = """${count}"""
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<TextView>(R.id.counter)

        counter.text = """$count"""

        val plusbtn = findViewById<Button>(R.id.plusbtn)
        val minusbtn = findViewById<Button>(R.id.minusbtn)

        plusbtn.setOnClickListener {
            counter.text = """${++count}"""
        }

        minusbtn.setOnClickListener {
            counter.text = """${--count}"""
        }
    }
}
