package com.ichsan.value.data

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ichsan.value.R
import com.ichsan.value.common.BaseActivity
import com.ichsan.value.databinding.ActivityFormInputScreenBinding
import com.ichsan.value.main.MainActivity
import com.ichsan.value.screen.profile.ProfileScreen
import kotlinx.android.synthetic.main.activity_form_input_screen.*

class FormInputScreen : BaseActivity() {
    private lateinit var binding : ActivityFormInputScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_form_input_screen)

        btnfragment.setOnClickListener {
           val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnInputSave.setOnClickListener {

            val etName = binding.etInputName.text.toString()
            val etGender = binding.etInputGender.text.toString()
            val etCountry = binding.etInputCountry.text.toString()
            val etAddress = binding.etInputAddress.text.toString()
            val etEdu = binding.etInputEdu.text.toString()
            val etExp = binding.etInputExp.text.toString()
            val etSkill = binding.etInputSkill.text.toString()
            val etPhone = binding.etInputPhone.text.toString()
            val etEmail = binding.etInputEmail.text.toString()
            val etSos = binding.etInputLinkSosmed.text.toString()
            val etDob = binding.etInputDate.text.toString()



            val intentSave = Intent(this, ProfileScreen::class.java)
            baseStartActivity<FormInputScreen>(this)

            intentSave.putExtra("namePut", etName)
            intentSave.putExtra("genderPut", etGender)
            intentSave.putExtra("countryPut", etCountry)
            intentSave.putExtra("addressPut", etAddress)
            intentSave.putExtra("eduPut", etEdu)
            intentSave.putExtra("expPut", etExp)
            intentSave.putExtra("skillPut", etSkill)
            intentSave.putExtra("phonePut", etPhone)
            intentSave.putExtra("emailPut", etEmail)
            intentSave.putExtra("sosPut", etSos)
            intentSave.putExtra("dobPut", etDob)

            startActivity(intentSave)

        }
    }

    override fun clickListener() {

    }
}