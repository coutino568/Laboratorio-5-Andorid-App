package com.example.andres.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addNewContactButton= findViewById<Button>(R.id.addContactButton)
        addNewContactButton.setOnClickListener{
            launchAddNewContactActivity()
        }



//        listView= findViewById(R.id.contactList)
//        listView.adapter = ItemAdapter(applicationContext, appExtension.allContacts)
//
//        // val contactAdapter =
//
//        listView.setOnItemClickListener { _, _, position, _ ->
//            val intent = Intent(this, OneContactActivity::class.java)
//            intent.putExtra("name", appExtension.allContacts[position].name)
//            intent.putExtra("number", appExtension.allContacts[position].number)
//            intent.putExtra("email", appExtension.allContacts[position].email)
//            startActivity(intent)
//        }



    }
//addContactButton
    fun launchAddNewContactActivity(){
        val myintent = Intent(this,newContactActivity::class.java)
        startActivity(myintent)
        //metodo que debe ser llamado al presionar el boton de agregar contacto.
    }

    fun loadSelectedContact(){

    }
}
