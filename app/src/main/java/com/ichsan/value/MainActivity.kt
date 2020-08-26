package com.ichsan.value

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = intent.getStringExtra("namePut")
        val country = intent.getStringExtra("countryPut")
        val address = intent.getStringExtra("addressPut")
        val edu = intent.getStringExtra("eduPut")
        val exp = intent.getStringExtra("expPut")
        val skill = intent.getStringExtra("skillPut")
        val phone = intent.getStringExtra("phonePut")
        val email = intent.getStringExtra("emailPut")
        val sos = intent.getStringExtra("sosPut")
        val dob = intent.getStringExtra("dobPut")



        val mainTv = findViewById<TextView>(R.id.tv_main)
        mainTv.text = "Name :" + name + "\nCountry :" + country + "\nAddress :" + address + "\nEdu :" + edu + "\nexp" + exp + "\nskill:"+ skill + "\nphone :" + phone + "\nemail :" + email + "\nsos :" + sos + "\ndob :" + dob

    }
}