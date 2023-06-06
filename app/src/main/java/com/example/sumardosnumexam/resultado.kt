package com.example.sumardosnumexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class resultado : AppCompatActivity() {

    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        txtResultado = findViewById(R.id.resultado)

        val result = intent.getIntExtra("Result", 0)
        txtResultado.text = "El resultado es: $result"


    }
}