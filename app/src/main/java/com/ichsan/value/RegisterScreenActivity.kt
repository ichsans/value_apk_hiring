package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_register_screen.*

class RegisterScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        clickListener()

    }

    override fun clickListener() {
        val tvToLogin = findViewById<TextView>(R.id.tvToLogin)
        tvToLogin.setOnClickListener {
            baseStartActivity<LoginScreenActivity>(this)

        }
    }


}