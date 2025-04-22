package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Navigate to category-specific home screens
        findViewById<LinearLayout>(R.id.accessories_section).setOnClickListener {
            startActivity(Intent(this, AccessoriesActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.eatables_section).setOnClickListener {
            startActivity(Intent(this, EatablesActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.artcraft_section).setOnClickListener {
            startActivity(Intent(this, ArtCraftActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.clothing_section).setOnClickListener {
            startActivity(Intent(this, ClothingActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.skincare_section).setOnClickListener {
            startActivity(Intent(this, SkincareActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.books_section).setOnClickListener {
            startActivity(Intent(this, BooksActivity::class.java))
        }
    }
}
