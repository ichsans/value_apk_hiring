package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_on_board.*

class OnBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board)

        val btnLogin = findViewById<Button>(R.id.btn_tologin)
        val btnReg = findViewById<Button>(R.id.btn_toreg)

        val intenLogin = Intent(this, LoginScreenActivity::class.java)
        val intenReg = Intent(this, RegisterScreenActivity::class.java)

        btnLogin.setOnClickListener {

            startActivity(intenLogin)
        }
        btnReg.setOnClickListener {
            startActivity(intenReg)
        }
    }
}