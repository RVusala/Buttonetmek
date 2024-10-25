package com.example.homepage

import ContactActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var buttonHome: Button
    private lateinit var buttonContact: Button
    private lateinit var buttonNothing: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView2)
        buttonHome = findViewById(R.id.button)
        buttonContact = findViewById(R.id.button2)
        buttonNothing = findViewById(R.id.button3)

        buttonHome.setOnClickListener {
            // Home butonuna tıklandığında yapılacaklar
            val intent = Intent(this, HomeActivity::class.java) // HomeActivity'yi tanımladığını varsayıyorum
            startActivity(intent)
        }

        buttonContact.setOnClickListener {
            // Contact butonuna tıklandığında yapılacaklar
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        buttonNothing.setOnClickListener {
            // Nothing butonuna tıklandığında yapılacaklar
            // Burada bir işlem yapabilirsiniz
        }
    }
}
