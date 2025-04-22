package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class AccessoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_01)

        val hairbandSection = findViewById<LinearLayout>(R.id.hairband_section)
        val totebagSection = findViewById<LinearLayout>(R.id.totebag_section)
        val keychainSection = findViewById<LinearLayout>(R.id.keychain_section)
        val braceletSection = findViewById<LinearLayout>(R.id.bracelet_section)

        hairbandSection.setOnClickListener {
            startActivity(Intent(this, AccessoriesHairbandActivity::class.java))
        }

        totebagSection.setOnClickListener {
            startActivity(Intent(this, AccessoriesTotebagActivity::class.java))
        }

        keychainSection.setOnClickListener {
            startActivity(Intent(this, AccessoriesKeychainActivity::class.java))
        }

        braceletSection.setOnClickListener {
            startActivity(Intent(this, AccessoriesBraceletActivity::class.java))
        }
    }
}
