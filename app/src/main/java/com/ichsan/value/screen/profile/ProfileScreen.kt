package com.ichsan.value.screen.profile

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.AppBarConfiguration
import com.google.android.material.navigation.NavigationView
import com.ichsan.value.R
import com.ichsan.value.common.BaseActivity
import com.ichsan.value.databinding.ActivityProfileScreenBinding

class ProfileScreen : BaseActivity() {

    private lateinit var binding : ActivityProfileScreenBinding

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_screen)





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

        binding.tvName.text = name
        binding.tvGender.text = gender
        binding.tvCountry.text = country
        binding.tvAddress.text = address
        binding.tvEdu.text = edu
        binding.tvExp.text = exp
        binding.tvSkill.text = skill
        binding.tvPhone.text = phone
        binding.tvEmail.text = email
        binding.tvLinkSosmed.text = sos
        binding.tvDob.text = dob

        


    }

    override fun clickListener() {
        TODO("Not yet implemented")
    }
}