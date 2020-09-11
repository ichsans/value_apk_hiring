package com.ichsan.value.screen.profile

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.ichsan.value.R
import com.ichsan.value.data.SheredPreferenceHelper
import com.ichsan.value.databinding.FragmentProfileBinding
import com.ichsan.value.login.LoginScreenActivity
import com.ichsan.value.main.MainActivity
import com.ichsan.value.webview.GithubWebViewActivity
import kotlinx.android.synthetic.main.activity_profile_screen.*


class ProfileFragment() : Fragment() {

//    private lateinit var mDrawer: DrawerLayout
    private lateinit var rootView: View
    private lateinit var sharedPref : SheredPreferenceHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPref = activity?.let { SheredPreferenceHelper(it) }!!

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
           // Inflate the layout for this fragment
        rootView = inflater.inflate( R.layout.profile_navigation, container, false)
      val drawerLayout : DrawerLayout = rootView.findViewById(R.id.drawer_layout)
        val navigationView : NavigationView = rootView.findViewById(R.id.nav_view)
        return rootView


    }
    private fun DialogOut(){
        val dialog = activity?.let {
            AlertDialog.Builder(it)
                .setTitle("Are You Sure want to Log out")
                .setCancelable(false)
                .setPositiveButton("YES"){ dialog: DialogInterface?, which : Int ->
                    sharedPref.clear()
                  var i = Intent(activity,LoginScreenActivity::class.java)
                   startActivity(i)
                    Toast.makeText(it, "Log Out", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("NO"){dialogInterface, i ->
                    dialogInterface.dismiss()
                }
        }
        dialog!!.show()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnGithub.setOnClickListener {
            (activity as MainActivity?)?.let{
                val intent = Intent(it, GithubWebViewActivity::class.java)
                it.startActivity(intent)
            }
        }
        logout.setOnClickListener {
            DialogOut()


        }

//


    }

    }








