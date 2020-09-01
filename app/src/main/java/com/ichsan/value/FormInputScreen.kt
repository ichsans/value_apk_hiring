package com.ichsan.value

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_form_input_screen.*

class FormInputScreen : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_input_screen)

        val btnSave = findViewById<Button>(R.id.btn_input_save)
        btnSave.setOnClickListener {
            val nameEt = findViewById<EditText>(R.id.et_input_name)
            val countryEt = findViewById<EditText>(R.id.et_input_country)
            val genderEt = findViewById<EditText>(R.id.et_input_gender)
            val addressEt = findViewById<EditText>(R.id.et_input_address)
            val eduEt = findViewById<EditText>(R.id.et_input_edu)
            val expEt = findViewById<EditText>(R.id.et_input_exp)
            val skillEt = findViewById<EditText>(R.id.et_input_skill)
            val phoneEt = findViewById<EditText>(R.id.et_input_phone)
            val emailEt = findViewById<EditText>(R.id.et_input_email)
            val sosEt = findViewById<EditText>(R.id.et_input_link_sosmed)
            val dobEt = findViewById<EditText>(R.id.et_input_date)

            val etName = nameEt.text.toString()
            val etGender = genderEt.text.toString()
            val etCountry = countryEt.text.toString()
            val etAddress = addressEt.text.toString()
            val etEdu = eduEt.text.toString()
            val etExp = expEt.text.toString()
            val etSkill = skillEt.text.toString()
            val etPhone = phoneEt.text.toString()
            val etEmail = emailEt.text.toString()
            val etSos = sosEt.text.toString()
            val etDob = dobEt.text.toString()
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