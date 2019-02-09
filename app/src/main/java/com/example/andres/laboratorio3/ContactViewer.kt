package com.example.andres.laboratorio3

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_contact_viewer.*

class ContactViewer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_viewer)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Hello, beautiful", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }



        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener{
            finish()
        }




    }

}
