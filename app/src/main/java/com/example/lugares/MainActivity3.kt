package com.example.lugares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val nextButton = findViewById<ImageButton>(R.id.imageButton)
        nextButton.setOnClickListener {
            startActivity(Intent(this@MainActivity3,MainActivity4::class.java))
            finish()
        }
        val prevButton = findViewById<ImageButton>(R.id.imageButton2)
        prevButton.setOnClickListener {
            startActivity(Intent(this@MainActivity3,MainActivity2::class.java))
            finish()
        }
    }
}