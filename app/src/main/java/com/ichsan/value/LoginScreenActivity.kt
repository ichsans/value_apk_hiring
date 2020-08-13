package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register_screen.*

class LoginScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val btn_login = findViewById<Button>(R.id.btnLogin)
        val tvToReg = findViewById<TextView>(R.id.tvToReg)


        val intent_login = Intent(this, FormInputScreen::class.java)




        btn_login.setOnClickListener {
            Toast.makeText(this, "Login Success!!!", Toast.LENGTH_SHORT).show()
            startActivity(intent_login)
        }

        tvToReg.setOnClickListener {

            val intentReg = Intent(this, RegisterScreenActivity::class.java)

            startActivity(intentReg)
        }
    }
}