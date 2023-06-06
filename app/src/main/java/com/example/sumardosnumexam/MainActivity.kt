package com.example.sumardosnumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var imgoff: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button_acc)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, calcular::class.java)
            startActivity(intent)
        }
        imgoff = findViewById(R.id.off)
        imgoff.setOnClickListener {
            finishAffinity()
        }





    }

}