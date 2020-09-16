package com.ichsan.value.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ichsan.value.R
import com.ichsan.value.common.BaseActivity
import com.ichsan.value.data.Constant
import com.ichsan.value.data.Constant.Companion.PREF_IS_LOGIN
import com.ichsan.value.data.SheredPreferenceHelper
import com.ichsan.value.databinding.ActivityLoginScreenBinding
import com.ichsan.value.main.MainActivity
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreenActivity : BaseActivity() {

    private lateinit var binding : ActivityLoginScreenBinding
    private lateinit var sharedPref : SheredPreferenceHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_screen)
sharedPref = SheredPreferenceHelper(this)
        clickListener()

    }

    override fun onStart() {
        super.onStart()
        if (sharedPref.getBoolean(Constant.PREF_IS_LOGIN)) {
//
            moveIntent()
            finish()
        }
    }
    private fun moveIntent(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }


    override fun clickListener() {

        binding.btnLogin.setOnClickListener {
            if (et_email.text.isNotEmpty() && et_pass.text.isNotEmpty()) {
                val email = et_email.text.toString()
                val pass = et_pass.text.toString()
                val emailReg = sharedPref.getString(Constant.PREF_EMAIL)
                val passReg = sharedPref.getString(Constant.PREF_PASSWORD)
                if (email == emailReg || pass == passReg) {
                    sharedPref.put(PREF_IS_LOGIN, true)
                    Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show()
                    moveIntent()
                }else {
                    binding.etEmail.error = "Email Salah"
                    binding.etPass.error = "Password Salah"
            }
            } else {
                binding.etEmail.error = "Email kosong"
                binding.etPass.error = "Password kosong"
            }
        }

            binding.tvToReg.setOnClickListener {

                baseStartActivity<RegisterScreenActivity>(this)
            }


        }
    }

