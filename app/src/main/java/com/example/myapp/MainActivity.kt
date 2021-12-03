package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.fragement_about)


        val btnContact = findViewById<ImageButton>(R.id.HomeBtnContact)
        btnContact.setOnClickListener{
            val intent = Intent(this, To_page_contact::class.java)
            startActivity(intent)
        }

        val btnAbout = findViewById<ImageButton>(R.id.HomeBtnAbout)
        btnAbout.setOnClickListener {
            var intent2 = Intent(this, To_page_about::class.java)
            startActivity(intent2)
        }
    }
}