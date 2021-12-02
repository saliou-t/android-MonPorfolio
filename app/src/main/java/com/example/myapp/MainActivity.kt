package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.fragements.HomeFragement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_contact)

        //injecter le fragment dans notre boite fragment_container
        //val transaction = supportFragmentManager.beginTransaction()
        //transaction.replace(R.id.fragement_container, HomeFragement())
        //transaction.addToBackStack(null)
        //transaction.commit()
    }
}