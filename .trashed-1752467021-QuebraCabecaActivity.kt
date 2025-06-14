package com.example.mundocolorido

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuebraCabecaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quebra_cabeca)

        val imagemProfissao = findViewById<ImageView>(R.id.imgProfissao)

        imagemProfissao.setOnClickListener {
            Toast.makeText(this, "Parabéns! Você completou o quebra-cabeça!", Toast.LENGTH_SHORT).show()
        }
    }
}
