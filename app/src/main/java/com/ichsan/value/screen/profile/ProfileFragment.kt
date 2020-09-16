package com.ichsan.value.screen.profile


import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.ichsan.value.R
import com.ichsan.value.data.SheredPreferenceHelper
import com.ichsan.value.databinding.FragmentProfileBinding
import com.ichsan.value.login.LoginScreenActivity
import com.ichsan.value.main.MainActivity
import com.ichsan.value.webview.GithubWebViewActivity
import kotlinx.android.synthetic.main.activity_profile_screen.*
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment() : Fragment(R.layout.fragment_profile) {

    //    private lateinit var mDrawer: DrawerLayout
    private lateinit var binding: FragmentProfileBinding
    private lateinit var sharedPref: SheredPreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPref = activity?.let { SheredPreferenceHelper(it) }!!


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentProfileBinding.inflate(inflater)

        return binding.root


    }

    private fun DialogOut() {
        val dialog = activity?.let {
            AlertDialog.Builder(it)
                .setTitle("Are You Sure want to Log out")
                .setCancelable(false)
                .setPositiveButton("YES") { dialog: DialogInterface?, which: Int ->
                    sharedPref.clear()
                    var i = Intent(activity, LoginScreenActivity::class.java)
                    startActivity(i)
                    Toast.makeText(it, "Log Out", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("NO") { dialogInterface, i ->
                    dialogInterface.dismiss()
                }
        }
        dialog!!.show()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.iv_menu.setOnClickListener{
            view.profile_drawer.openDrawer(GravityCompat.END)
        }

        btnGithub.setOnClickListener {

            (activity as MainActivity?)?.let{
                val intent = Intent(it, GithubWebViewActivity::class.java)
                it.startActivity(intent)
            }
        }
        logout.setOnClickListener {
            DialogOut()
        }

    }
    


   }








