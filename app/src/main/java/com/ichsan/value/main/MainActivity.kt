package com.ichsan.value.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ichsan.value.R
import com.ichsan.value.databinding.ActivityMain2Binding
import com.ichsan.value.screen.home.HomeFragment
import com.ichsan.value.screen.offer.OfferFragment
import com.ichsan.value.screen.profile.ProfileFragment
import com.ichsan.value.screen.project.RecyclerFragment
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

private lateinit var binding : ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)

        makeCurrent(HomeFragment())

    button_navigation_view.setOnNavigationItemSelectedListener {
    when(it.itemId){
        R.id.home -> makeCurrent(HomeFragment())
        R.id.offer -> makeCurrent(OfferFragment())
        R.id.project -> makeCurrent(RecyclerFragment())
        R.id.profile -> makeCurrent(ProfileFragment())
    }
    return@setOnNavigationItemSelectedListener true
}

    }
    private fun makeCurrent (fragment:Fragment){
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fragment,fragment)
            commit()
        }
    }
}