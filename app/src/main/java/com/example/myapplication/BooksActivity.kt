package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_03)

        val journalsCard = findViewById<LinearLayout>(R.id.journals_section)
        val handpaintedCard = findViewById<LinearLayout>(R.id.handpainted_section)
        val recycledCard = findViewById<LinearLayout>(R.id.recycled_section)
        val bookmarksCard = findViewById<LinearLayout>(R.id.bookmarks_section)

        journalsCard.setOnClickListener {
            startActivity(Intent(this, HandmadeDiariesActivity::class.java))
        }

        handpaintedCard.setOnClickListener {
            startActivity(Intent(this, HandPaintedCoversActivity::class.java))
        }

        recycledCard.setOnClickListener {
            startActivity(Intent(this, RecycledNotepadsActivity::class.java))
        }

        bookmarksCard.setOnClickListener {
            startActivity(Intent(this, DecoratedBookmarksActivity::class.java))
        }
    }
}
