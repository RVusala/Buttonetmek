package com.example.lemansdf

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // 2 saniyəlik gecikmə
        Handler(Looper.getMainLooper()).postDelayed({
            // MainActivity-yə keçid
            val intent = Intent(this, MainActivity::class.java) // Intent yarat
            startActivity(intent) // startActivityForResult əvəzinə startActivity istifadə edin
            finish() // Splash ekranını bitirmək üçün
        }, 2000) // 2 saniyəlik gecikmə
    }
}