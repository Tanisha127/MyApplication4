package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class HomeScreen06Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_06) // link to home_screen_06.xml

        // Connect the profile icon click to BuyerProfileActivity
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)
        navProfile.setOnClickListener {
            Log.d("HomeScreen", "Profile clicked!")
            val intent = Intent(this, BuyerProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
