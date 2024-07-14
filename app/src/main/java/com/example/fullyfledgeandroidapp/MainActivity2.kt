package com.example.fullyfledgeandroidapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)

        val btnIntent1 = findViewById<Button>(R.id.android)
        btnIntent1.setOnClickListener {
            intent = Intent(applicationContext, AndroidAppDevelopment::class.java)
            startActivity(intent)
        }

        val btnIntent2 = findViewById<Button>(R.id.webd)
        btnIntent2.setOnClickListener {
             intent = Intent(applicationContext, webD::class.java)
            startActivity(intent)
        }

        val btnIntent3 = findViewById<Button>(R.id.ios)
        btnIntent3.setOnClickListener {
            intent = Intent(applicationContext, iosappdev::class.java)
            startActivity(intent)
        }

        val btnIntent4 = findViewById<Button>(R.id.ml)
        btnIntent4.setOnClickListener {
            intent = Intent(applicationContext, MachineLearning::class.java)
            startActivity(intent)
        }

        val cameraButton = findViewById<CardView>(R.id.cardCamera)
        cameraButton.setOnClickListener{
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent1)
        }

        val button = findViewById<CardView>(R.id.button_call)
        button.setOnClickListener {
            val phoneNumber = "tel:6969696969"
            val intent =Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse(phoneNumber)
            }
            startActivity(intent)
        }

        val webButton = findViewById<Button>(R.id.cardWeb)
        webButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.in/")
            startActivity(intent)
        }


    }
}