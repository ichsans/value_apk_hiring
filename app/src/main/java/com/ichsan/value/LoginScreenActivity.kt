package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register_screen.*

class LoginScreenActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        clickListener()

    }


    override fun clickListener() {
        val btn_login = findViewById<Button>(R.id.btnLogin)
        val tvToReg = findViewById<TextView>(R.id.tvToReg)

        btn_login.setOnClickListener {
            Toast.makeText(this, "Login Success!!!", Toast.LENGTH_SHORT).show()
            baseStartActivity<FormInputScreen>(this)
        }

        tvToReg.setOnClickListener {

            baseStartActivity<RegisterScreenActivity>(this)
        }



    }

}