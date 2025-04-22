package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class HomeScreen01Activity : AppCompatActivity() {

    private lateinit var searchInput: EditText
    private lateinit var navCatalog: LinearLayout
    private lateinit var navSearch: LinearLayout
    private lateinit var navFavorites: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_01)

        // Initialize Views
        searchInput = findViewById(R.id.search_input)
        navCatalog = findViewById(R.id.navCatalog)
        navSearch = findViewById(R.id.navSearch)
        navFavorites = findViewById(R.id.navFavorites)
        navProfile = findViewById(R.id.navProfile)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        navCatalog.setOnClickListener {
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Home screen or refresh
        }

        navSearch.setOnClickListener {
            Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
            // Open advanced search screen
        }

        navFavorites.setOnClickListener {
            Toast.makeText(this, "Favorites clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Favorites
        }

        navProfile.setOnClickListener {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Profile
        }
    }
}
