package com.example.perfilusuari

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form)
        val NomF = findViewById<TextView>(R.id.editTextNom)
        val CorreuF = findViewById<TextView>(R.id.editTextEmailAddress)
        val DescripcioF = findViewById<TextView>(R.id.editTextDescripcio)
        val ImatgeF = findViewById<TextView>(R.id.editTextImatge)
        val Save = findViewById<Button>(R.id.buttonSave)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Save.setOnClickListener {
            val nextPantalla = Intent(this, ProfileActivity::class.java).apply {
                putExtra("NOM", NomF.text.toString() )
                putExtra("CORREU", CorreuF.text.toString() )
                putExtra("DESCRIPCIO", DescripcioF.text.toString() )
                putExtra("IMATGE", ImatgeF.text.toString() )}
            startActivity(nextPantalla)
        }
    }
}