package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_register_screen.*

class RegisterScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)


       val intentLog = Intent(this, LoginScreenActivity::class.java)
        val tvToLogin = findViewById<TextView>(R.id.tvToLogin)


        tvToLogin.setOnClickListener {
            startActivity(intentLog)

        }
    }
}