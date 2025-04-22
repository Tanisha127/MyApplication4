package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class EatablesActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_02)

        val makhanaCard = findViewById<LinearLayout>(R.id.makhana_section)
        val granolaCard = findViewById<LinearLayout>(R.id.granola_section)
        val picklesCard = findViewById<LinearLayout>(R.id.pickles_section)
        val cookiesCard = findViewById<LinearLayout>(R.id.cookies_section)

        makhanaCard.setOnClickListener {
            startActivity(Intent(this, EatablesMakhanaActivity::class.java))
        }

        granolaCard.setOnClickListener {
            startActivity(Intent(this, EatablesGranolaBarsActivity::class.java))
        }

        picklesCard.setOnClickListener {
            startActivity(Intent(this, EatablesPicklesActivity::class.java))
        }

        cookiesCard.setOnClickListener {
            startActivity(Intent(this, EatablesBakedCookiesActivity::class.java))
        }
    }
}
