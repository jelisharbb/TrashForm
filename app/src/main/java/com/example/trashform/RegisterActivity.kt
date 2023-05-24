package com.example.trashform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    private lateinit var signIn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        signIn = findViewById(R.id.signIn)

        signIn.setOnClickListener {
            val intent = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}