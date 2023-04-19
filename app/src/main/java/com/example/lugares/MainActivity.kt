package com.example.lugares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    public
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<AppCompatButton>(R.id.button)
        val rollNumber  = findViewById<EditText>(R.id.rollNumber)
        button.setOnClickListener {
            if (rollNumber.text.toString().isEmpty()) {
                Toast.makeText(this,"Enter your roll number!",LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                finish()
            }
        }
    }
}