package com.example.ejemplonavegacionactivides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_c)

        val mensaje = intent.getStringExtra("MENSAJE")
        val mensaje_a = intent.getStringExtra("MENSAJE_A")
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

        val boton = findViewById<Button>(R.id.boton_regresar_a_B)
        boton.setOnClickListener {
            /*val intent = Intent(this, ActividadB::class.java)
            startActivity(intent)*/

            finish() // la manera correcta de regresar a una actividad anterior o de finalizar la actividad actuak

            /*val intent = Intent(this, ActividadB::class.java)
            intent.putExtra("MENSAJE", mensaje_a)
            startActivity(intent)*/
        }
    }
}
