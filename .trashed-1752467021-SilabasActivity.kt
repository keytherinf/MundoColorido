package com.example.mundocolorido

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SilabasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silabas)

        val txtPalavra = findViewById<TextView>(R.id.txtPalavra)
        val btnResposta = findViewById<Button>(R.id.btnResponder)

        btnResposta.setOnClickListener {
            Toast.makeText(this, "Muito bem!", Toast.LENGTH_SHORT).show()
        }
    }
}
