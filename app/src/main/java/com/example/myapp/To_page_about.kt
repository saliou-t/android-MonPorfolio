package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class To_page_about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_about)

        val btnContact = findViewById<ImageButton>(R.id.HomeBtnContact)
        btnContact.setOnClickListener{
            val intent = Intent(this, To_page_contact::class.java)
            startActivity(intent)
        }

        val btnHome= findViewById<ImageButton>(R.id.HomeBtnHome)
        btnHome.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }

}