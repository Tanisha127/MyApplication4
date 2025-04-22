package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class SkincareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_06)

        val herbalFacePackSection = findViewById<LinearLayout>(R.id.face_pack_section)
        val diyLipBalmSection = findViewById<LinearLayout>(R.id.lip_balm_section)
        val bodyScrubsSection = findViewById<LinearLayout>(R.id.body_scrubs_section)
        val ruralSoapsSection = findViewById<LinearLayout>(R.id.soaps_section)

        herbalFacePackSection.setOnClickListener {
            startActivity(Intent(this, SkincareFacePackActivity::class.java))
        }

        diyLipBalmSection.setOnClickListener {
            startActivity(Intent(this, SkincareLipBalmActivity::class.java))
        }

        bodyScrubsSection.setOnClickListener {
            startActivity(Intent(this, SkincareBodyScrubsActivity::class.java))
        }

        ruralSoapsSection.setOnClickListener {
            startActivity(Intent(this, SkincareNaturalSoapsActivity::class.java))
        }
    }
}
