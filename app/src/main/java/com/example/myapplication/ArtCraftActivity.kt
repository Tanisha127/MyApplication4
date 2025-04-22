package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ArtCraftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_04)

        val wallHangingSection = findViewById<LinearLayout>(R.id.wall_hanging_section)
        val quiltingFramesSection = findViewById<LinearLayout>(R.id.quilting_frames_section)
        val origamiDecorSection = findViewById<LinearLayout>(R.id.origami_decor_section)
        val paintedGlassSection = findViewById<LinearLayout>(R.id.painted_jars_section)

        wallHangingSection.setOnClickListener {
            startActivity(Intent(this, DIYWallHangingActivity::class.java))
        }

        quiltingFramesSection.setOnClickListener {
            startActivity(Intent(this, QuiltingArtFramesActivity::class.java))
        }

        origamiDecorSection.setOnClickListener {
            startActivity(Intent(this, OrigamiDecorPiecesActivity::class.java))
        }

        paintedGlassSection.setOnClickListener {
            startActivity(Intent(this, PaintedGlassJarsActivity::class.java))
        }
    }
}
