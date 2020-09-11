package com.ichsan.value.login

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ichsan.value.R
import com.ichsan.value.common.BaseActivity
import com.ichsan.value.data.Constant
import com.ichsan.value.data.SheredPreferenceHelper
import com.ichsan.value.databinding.ActivityLoginScreenBinding
import com.ichsan.value.databinding.ActivityRegisterScreenBinding
import com.ichsan.value.login.LoginScreenActivity
import com.ichsan.value.main.MainActivity
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_register_screen.*

class RegisterScreenActivity : BaseActivity() {

    private lateinit var binding: ActivityRegisterScreenBinding

    private lateinit var sharedPref: SheredPreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register_screen)

        sharedPref = SheredPreferenceHelper(this)

        clickListener()

    }

    private fun moveIntent() {
        startActivity(Intent(this, LoginScreenActivity::class.java))
        finish()
    }

    override fun clickListener() {

        btnReg.setOnClickListener {
            if (et_email_reg.text.isNotEmpty() && et_pass.text.isNotEmpty()) {
                sharedPref.put(Constant.PREF_USERNAME, et_email_reg.text.toString())
                sharedPref.put(Constant.PREF_PASSWORD, et_pass_reg.text.toString())
                sharedPref.put(Constant.PREF_IS_LOGIN, true)
                Toast.makeText(this, "Success Register", Toast.LENGTH_SHORT).show()
                moveIntent()
            }

            binding.tvToLogin.setOnClickListener {
                onBackPressed()

            }
        }


    }
}