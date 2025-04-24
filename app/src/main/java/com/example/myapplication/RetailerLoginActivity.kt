package com.example.myapplication

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class RetailerLoginActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etEmail: EditText
    private lateinit var etDOB: EditText
    private lateinit var etPassword: EditText
    private lateinit var spinnerBusiness: Spinner
    private lateinit var etID: EditText
    private lateinit var etInstitution: EditText
    private lateinit var etContact: EditText
    private lateinit var btnSubmit: Button
    private lateinit var forgotPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.retailer)

        // Initialize views
        etUsername = findViewById(R.id.etUsername)
        etEmail = findViewById(R.id.etEmail)
        etDOB = findViewById(R.id.etDOB)
        etPassword = findViewById(R.id.etPassword)
        spinnerBusiness = findViewById(R.id.spinnerBusiness)
        etID = findViewById(R.id.etID)
        etInstitution = findViewById(R.id.etInstitution)
        etContact = findViewById(R.id.etContact)
        btnSubmit = findViewById(R.id.btnSubmit)
        forgotPassword = findViewById(R.id.forgot_password)

        // Set up spinner
        val businessTypes = arrayOf(
            "Select Business Type", "Clothing", "Food", "Accessories",
            "Books", "Skincare", "Art & Craft"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, businessTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerBusiness.adapter = adapter

        // Date Picker for DOB
        etDOB.setOnClickListener {
            showDatePicker()
        }

        // Handle forgot password click
        forgotPassword.setOnClickListener {
            Toast.makeText(this, "Forgot Password clicked", Toast.LENGTH_SHORT).show()
        }

        // Handle submit/login button click
        btnSubmit.setOnClickListener {
            validateLogin()
        }
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePicker = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
            val dob = "$selectedDay/${selectedMonth + 1}/$selectedYear"
            etDOB.setText(dob)
        }, year, month, day)

        datePicker.show()
    }

    private fun validateLogin() {
        val username = etUsername.text.toString().trim()
        val email = etEmail.text.toString().trim()
        val dob = etDOB.text.toString().trim()
        val password = etPassword.text.toString().trim()
        val business = spinnerBusiness.selectedItem.toString()

        if (username.isEmpty() || email.isEmpty() || dob.isEmpty() || password.isEmpty() || business == "Select Business Type") {
            Toast.makeText(this, "Please fill in all fields and select a business type", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Retailer Login Successful", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra("RETAILER_USERNAME", username)
            intent.putExtra("RETAILER_BUSINESS", business)
            intent.putExtra("RETAILER_DOB", dob)
            startActivity(intent)
            finish()
        }
    }
}