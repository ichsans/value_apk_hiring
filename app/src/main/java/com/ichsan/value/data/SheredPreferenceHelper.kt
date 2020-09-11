package com.ichsan.value.data

import android.content.Context
import android.content.SharedPreferences

class SheredPreferenceHelper(context: Context){
    private val PRESS_NAME = "PRESS_NAME"
    private val sharedPref : SharedPreferences
    val editor: SharedPreferences.Editor

    init {
        sharedPref = context.getSharedPreferences(PRESS_NAME,Context.MODE_PRIVATE)
        editor = sharedPref.edit()
    }
    fun put (key: String, value: Boolean){
        editor.putBoolean(key, value)
            .apply()
    }
    fun getBoolean(key: String) : Boolean{
        return sharedPref.getBoolean(key, false)
    }
    fun put (key: String, value: String){
        editor.putString(key, value)
            .apply()
    }
    fun getString(key: String) : String?{
        return sharedPref.getString(key, null)
    }
    fun clear(){
        editor.clear()
            .apply()
    }




}

