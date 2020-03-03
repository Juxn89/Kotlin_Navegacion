package com.example.ejemplonavegacionactivides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button_main)
        boton.setOnClickListener {
            val intent = Intent(this, ActividadB::class.java)
            startActivity(intent)
        }
    }
}
