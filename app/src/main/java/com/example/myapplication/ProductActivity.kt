package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        // Bottom navigation buttons
        val homeButton = findViewById<ImageButton>(R.id.homeButton)
        val learnButton = findViewById<ImageButton>(R.id.learnButton)
        val growthButton = findViewById<ImageButton>(R.id.growthButton)
        val profileButton = findViewById<ImageButton>(R.id.profileButton)

        // Click listeners for each bottom navigation button
        homeButton.setOnClickListener {
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
            // Handle navigation to Home Activity (optional)
            // val intent = Intent(this, HomeActivity::class.java)
            // startActivity(intent)
        }

        learnButton.setOnClickListener {
            // Navigate to Learning Resources Activity
            Toast.makeText(this, "Learning clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LearningResourcesActivity::class.java)
            startActivity(intent)
        }

        growthButton.setOnClickListener {
            // Navigate to Growth Activity
            Toast.makeText(this, "Growth clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GrowthActivity::class.java)
            startActivity(intent)
        }

        profileButton.setOnClickListener {
            // Navigate to Profile Activity
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
