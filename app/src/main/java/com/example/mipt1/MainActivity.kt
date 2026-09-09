package com.example.mipt1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.graphics.toColorInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val paspauskButton = findViewById<Button>(R.id.paspauskButton)
        val spalvaButton = findViewById<Button>(R.id.spalvaButton)
        val patarle = findViewById<TextView>(R.id.patarle)

        paspauskButton.setOnClickListener {
            patarle.text = getString(R.string.patarle_kregzde)
        }
        spalvaButton.setOnClickListener {
            //naudojau pradzioje .setTextColor taciau anrdoid studio pasiule pakeisti i .toColorInt
            patarle.setTextColor("#B47ECF".toColorInt())
        }
    }
}