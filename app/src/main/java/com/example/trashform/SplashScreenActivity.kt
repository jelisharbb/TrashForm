package com.example.trashform

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private val splashDuration = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        val fadeAnimations = AnimationUtils.loadAnimation(this, R.anim.fade_out_animation)
        findViewById<View>(android.R.id.content).startAnimation(fadeAnimations)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        },splashDuration)

    }
}