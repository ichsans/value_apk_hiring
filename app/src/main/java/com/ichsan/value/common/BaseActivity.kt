package com.ichsan.value.common

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {


    lateinit var mActivity: AppCompatActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = this

    }
    abstract fun clickListener()

    protected inline fun <reified T : View> Activity.findView(id: Int) = findViewById(id) as T

    protected inline fun <reified ClassActivity> baseStartActivity(context: Context) {
        context.startActivity(Intent(context, ClassActivity::class.java))
    }
}

