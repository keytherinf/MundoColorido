package com.example.mundocolorido

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FormasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formas)

        val circulo = findViewById<ImageView>(R.id.imgCirculo)
        val som = MediaPlayer.create(this, R.raw.circulo_audio)

        circulo.setOnClickListener {
            som.start()
        }
    }
}
