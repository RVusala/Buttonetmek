package com.example.lemansdf

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lemansdf.R

class HomeScreen : AppCompatActivity() {

    // View-larınızı burada elan edin
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var buttonDog: Button
    private lateinit var buttonCat: Button
    private lateinit var buttonBird: Button
    private lateinit var buttonFish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)  // XML faylı burda bağlayırıq

        // View-ları tapmaq və təyin etmək
        imageView = findViewById(R.id.imageView)
        buttonDog = findViewById(R.id.buttonDog)
        buttonCat = findViewById(R.id.buttonCat)
        buttonBird = findViewById(R.id.buttonBird)
        buttonFish = findViewById(R.id.buttonFish)

        // Button funksional
        buttonDog.setOnClickListener {
        }

        buttonCat.setOnClickListener {
        }

        buttonBird.setOnClickListener {
        }

        buttonFish.setOnClickListener {
            finish()  // App-i bağlamaq üçün
        }


    }
}
