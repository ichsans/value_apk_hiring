package com.ichsan.value

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class ProfileScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)



        val name = intent.getStringExtra("namePut")
        val gender = intent.getStringExtra("genderPut")
        val country = intent.getStringExtra("countryPut")
        val address = intent.getStringExtra("addressPut")
        val edu = intent.getStringExtra("eduPut")
        val exp = intent.getStringExtra("expPut")
        val skill = intent.getStringExtra("skillPut")
        val phone = intent.getStringExtra("phonePut")
        val email = intent.getStringExtra("emailPut")
        val sos = intent.getStringExtra("sosPut")
        val dob = intent.getStringExtra("dobPut")

        val nameTv = findViewById<TextView>(R.id.tv_name)
        val genderTv = findViewById<TextView>(R.id.tv_gender)
        val countryTv = findViewById<TextView>(R.id.tv_country)
        val addressTv = findViewById<TextView>(R.id.tv_address)
        val eduTv = findViewById<TextView>(R.id.tv_edu)
        val expTv= findViewById<TextView>(R.id.tv_exp)
        val skillTv = findViewById<TextView>(R.id.tv_skill)
        val phoneTv = findViewById<TextView>(R.id.tv_phone)
        val emailTv = findViewById<TextView>(R.id.tv_email)
        val sosTv = findViewById<TextView>(R.id.tv_link_sosmed)
        val dobTv = findViewById<TextView>(R.id.tv_dob)

        nameTv.text = name
        genderTv.text = gender
        countryTv.text = country
        addressTv.text = address
        eduTv.text = edu
        expTv.text = exp
        skillTv.text = skill
        phoneTv.text = phone
        emailTv.text = email
        sosTv.text = sos
        dobTv.text = dob
        Log.d("nameString", name)


        


    }
}