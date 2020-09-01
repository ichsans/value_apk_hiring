package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            baseStartActivity<OnBoardActivity>(this)
            finish()
        }, 3000)//delaying 3 seconds to open login activity
    }

    override fun clickListener() {

    }

}