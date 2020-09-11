package com.ichsan.value.common

import android.os.Bundle
import android.os.Handler
import com.ichsan.value.OnBoard.OnBoardActivity
import com.ichsan.value.R
import com.ichsan.value.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : BaseActivity() {
    private lateinit var binding : ActivitySplashScreenBinding
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