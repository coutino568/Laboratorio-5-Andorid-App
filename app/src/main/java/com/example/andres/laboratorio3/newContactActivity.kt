package com.example.andres.laboratorio3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class newContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_contact)

        val backButton =findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener{
            finish()
        }

        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            Toast.makeText(this,"New contact submitted", Toast.LENGTH_SHORT).show()
        }
    }
}
