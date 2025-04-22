package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val email = binding.email.text.toString().trim()
            val password = binding.password.text.toString()
            val confirmPassword = binding.confirmPassword.text.toString()

            // Email Validation
            if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.email.error = "Enter a valid email"
                return@setOnClickListener
            }

            // Password Match Validation
            if (password != confirmPassword) {
                binding.errorMessage.text = "Passwords do not match!"
                binding.errorMessage.visibility = View.VISIBLE
                return@setOnClickListener
            }

            // Hide error message if everything is valid
            binding.errorMessage.visibility = View.GONE

            // Show success message
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

            // ✅ Navigate to DashboardActivity
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish() // Optional: Closes the login screen so user can't return using back button
        }
    }
}
