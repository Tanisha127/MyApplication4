package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ClothingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_05)

        val handPaintedTShirtsSection = findViewById<LinearLayout>(R.id.hand_painted_tshirts_section)
        val tieDyeScarvesSection = findViewById<LinearLayout>(R.id.tie_dye_scarves_section)
        val embroideredKurtisSection = findViewById<LinearLayout>(R.id.embroidered_kurtis_section)
        val recycledDenimBagsSection = findViewById<LinearLayout>(R.id.recycled_denim_bags_section)

        handPaintedTShirtsSection.setOnClickListener {
            startActivity(Intent(this, HandPaintedTShirtsActivity::class.java))
        }

        tieDyeScarvesSection.setOnClickListener {
            startActivity(Intent(this, TieDyeScarvesActivity::class.java))
        }

        embroideredKurtisSection.setOnClickListener {
            startActivity(Intent(this, EmbroideredKurtisActivity::class.java))
        }

        recycledDenimBagsSection.setOnClickListener {
            startActivity(Intent(this, RecycledDenimBagsActivity::class.java))
        }
    }
}
