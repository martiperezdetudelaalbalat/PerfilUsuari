package com.example.perfilusuari

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val NomP = findViewById<TextView>(R.id.textViewNom)
        val CorreuP = findViewById<TextView>(R.id.textViewCorreu)
        val DescripcioP = findViewById<TextView>(R.id.textViewDescripcio)
        val Imatge = findViewById<ImageView>(R.id.imageViewPerfil)

        NomP.text = intent.getStringExtra("NOM")
        CorreuP.text = intent.getStringExtra("CORREU")
        DescripcioP.text = intent.getStringExtra("DESCRIPCIO")
        Glide.with(Imatge)
            .load(intent.getStringExtra("IMATGE"))
            .into(Imatge)
    }
}