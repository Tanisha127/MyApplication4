package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LearningResourcesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learning_resources_page)

        // Assign links to each TextView
        setLink(findViewById(R.id.link1), "https://www.startupschool.org/")
        setLink(findViewById(R.id.link2), "https://www.coursera.org/learn/uva-darden-business-strategy")
        setLink(findViewById(R.id.link3), "https://online.hbs.edu/")

        setLink(findViewById(R.id.link4), "https://grow.google/intl/en_in/digitalgarage/")
        setLink(findViewById(R.id.link5), "https://academy.hubspot.com/")
        setLink(findViewById(R.id.link6), "https://neilpatel.com/blog/")

        setLink(findViewById(R.id.link7), "https://trailhead.salesforce.com/")
        setLink(findViewById(R.id.link8), "https://blog.close.com/")
        setLink(findViewById(R.id.link9), "https://www.coursera.org/specializations/art-of-sales")

    }

    private fun setLink(textView: TextView, url: String) {
        textView.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(browserIntent)
        }
    }
}
