package com.example.ejemplonavegacionactivides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

        val mensaje = intent.getStringExtra("MENSAJE")
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

        val boton_c = findViewById<Button>(R.id.boton_c)
        boton_c.setOnClickListener {
            val intent = Intent(this, ActividadC::class.java)
            intent.putExtra("MENSAJE", "Hacia actividad C")
            intent.putExtra("MENSAJE_A", mensaje)
            startActivity(intent)
        }

        val boton_d = findViewById<Button>(R.id.boton_d)
        boton_d.setOnClickListener {
            val intent = Intent(this, ActividadD::class.java)
            intent.putExtra("MENSAJE", "Hacia actividad D")
            startActivity(intent)
        }
    }
}
