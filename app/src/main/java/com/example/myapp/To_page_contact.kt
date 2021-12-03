package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class To_page_contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_contact)

        val btnHome= findViewById<ImageButton>(R.id.HomeBtnHome)
        btnHome.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
        val btnAbout= findViewById<ImageButton>(R.id.HomeBtnAbout)
        btnAbout.setOnClickListener {
            val intent2 = Intent(this, To_page_about::class.java)
            startActivity(intent2)
        }
    }

}