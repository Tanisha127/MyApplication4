package com.example.yourapp // Replace with your actual package name

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.yourapp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listeners for categories
        setupCategoryClickListeners()
    }

    private fun setupCategoryClickListeners() {
        // Accessories
        binding.accessoriesLayout.setOnClickListener {
            startActivity(Intent(this, AccessoriesActivity::class.java))
        }

        // Eatables
        // Add this class later: EatablesActivity
        findViewById<LinearLayout>(R.id.eatablesLayout)?.setOnClickListener {
            // startActivity(Intent(this, EatablesActivity::class.java))
        }

        // Books
        // Add this class later: BooksActivity
        findViewById<LinearLayout>(R.id.booksLayout)?.setOnClickListener {
            // startActivity(Intent(this, BooksActivity::class.java))
        }

        // Art and Craft
        // Add this class later: ArtCraftActivity
        findViewById<LinearLayout>(R.id.artcraftLayout)?.setOnClickListener {
            // startActivity(Intent(this, ArtCraftActivity::class.java))
        }

        // Clothes
        // Add this class later: ClothesActivity
        findViewById<LinearLayout>(R.id.clothingLayout)?.setOnClickListener {
            // startActivity(Intent(this, ClothesActivity::class.java))
        }

        // Skincare
        // Add this class later: SkincareActivity
        findViewById<LinearLayout>(R.id.skincareLayout)?.setOnClickListener {
            // startActivity(Intent(this, SkincareActivity::class.java))
        }
    }
}
