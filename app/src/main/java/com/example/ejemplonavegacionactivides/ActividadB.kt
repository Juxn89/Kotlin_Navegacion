package com.example.ejemplonavegacionactivides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActividadB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

        val boton_c = findViewById<Button>(R.id.boton_c)
        boton_c.setOnClickListener {
            val intent = Intent(this, ActividadC::class.java)
            startActivity(intent)
        }

        val boton_d = findViewById<Button>(R.id.boton_d)
        boton_d.setOnClickListener {
            val intent = Intent(this, ActividadD::class.java)
            startActivity(intent)
        }
    }
}
