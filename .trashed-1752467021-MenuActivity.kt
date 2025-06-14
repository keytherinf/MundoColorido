package com.example.mundocolorido

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSilabas = findViewById<Button>(R.id.btnSilabas)
        val btnQuebraCabeca = findViewById<Button>(R.id.btnQuebraCabeca)
        val btnFormas = findViewById<Button>(R.id.btnFormas)

        btnSilabas.setOnClickListener {
            startActivity(Intent(this, SilabasActivity::class.java))
        }

        btnQuebraCabeca.setOnClickListener {
            startActivity(Intent(this, QuebraCabecaActivity::class.java))
        }

        btnFormas.setOnClickListener {
            startActivity(Intent(this, FormasActivity::class.java))
        }
    }
}
