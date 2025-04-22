package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class UserTypeSelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_type_selector)

        val retailerButton = findViewById<Button>(R.id.btnRetailer)
        val buyerButton = findViewById<Button>(R.id.btnBuyer)

        retailerButton.setOnClickListener {
            val intent = Intent(this, RetailerLoginActivity::class.java)
            startActivity(intent)
        }

        buyerButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)  // MainActivity is your buyer login
            startActivity(intent)
        }
    }
}
