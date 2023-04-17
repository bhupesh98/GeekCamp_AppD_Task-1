package com.example.lugares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val nextButton = findViewById<ImageButton>(R.id.imageButton)
        nextButton.setOnClickListener {
            startActivity(Intent(this@MainActivity4,MainActivity::class.java))
            finish()
        }
        val prevButton = findViewById<ImageButton>(R.id.imageButton2)
        prevButton.setOnClickListener {
            startActivity(Intent(this@MainActivity4,MainActivity3::class.java))
            finish()
        }
    }
}