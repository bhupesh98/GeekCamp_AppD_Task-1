package com.example.lugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nextButton = findViewById<ImageButton>(R.id.imageButton)
        nextButton.setOnClickListener {
            startActivity(Intent(this@MainActivity2,MainActivity3::class.java))
            finish()
        }
    }
}