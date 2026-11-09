package com.example.pastilleroiot

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvEstado: TextView
    private lateinit var btn8m: Button
    private lateinit var btn8h: Button
    private lateinit var btn24h: Button
    private lateinit var btnDetener: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vincular componentes de la interfaz visual
        tvEstado = findViewById(R.id.tvEstado)
        btn8m = findViewById(R.id.btn8m)
        btn8h = findViewById(R.id.btn8h)
        btn24h = findViewById(R.id.btn24h)
        btnDetener = findViewById(R.id.btnDetener)

        // Configurar acciones para los intervalos del temporizador
        btn8m.setOnClickListener {
            tvEstado.text = "Estado: Activo (Ciclo de 8 Minutos)"
            Toast.makeText(this, "Temporizador configurado a 8 min", Toast.LENGTH_SHORT).show()
        }

        btn8h.setOnClickListener {
            tvEstado.text = "Estado: Activo (Ciclo de 8 Horas)"
            Toast.makeText(this, "Temporizador configurado a 8 horas", Toast.LENGTH_SHORT).show()
        }

        btn24h.setOnClickListener {
            tvEstado.text = "Estado: Activo (Ciclo de 24 Horas)"
            Toast.makeText(this, "Temporizador configurado a 24 horas", Toast.LENGTH_SHORT).show()
        }

        // Botón para detener la bocina y la luz intermitente
        btnDetener.setOnClickListener {
            tvEstado.text = "Estado: En espera de configuración"
            Toast.makeText(this, "Alarma y luz desactivadas manualmente", Toast.LENGTH_SHORT).show()
        }
    }
}