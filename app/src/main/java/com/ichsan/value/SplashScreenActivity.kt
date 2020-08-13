package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, OnBoardActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)//delaying 3 seconds to open login activity
    }
}