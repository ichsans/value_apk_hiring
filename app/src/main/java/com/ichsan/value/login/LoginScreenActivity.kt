package com.ichsan.value.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ichsan.value.R
import com.ichsan.value.common.BaseActivity
import com.ichsan.value.data.Constant
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
           if (et_email.text.isNotEmpty() && et_pass.text.isNotEmpty()){
               sharedPref.put(Constant.PREF_EMAIL, et_email.text.toString())
               sharedPref.put(Constant.PREF_PASSWORD, et_pass.text.toString())
               sharedPref.put(Constant.PREF_IS_LOGIN, true)
               Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show()
               moveIntent()
           }

        }

        binding.tvToReg.setOnClickListener {

            baseStartActivity<RegisterScreenActivity>(this)
        }



    }

}