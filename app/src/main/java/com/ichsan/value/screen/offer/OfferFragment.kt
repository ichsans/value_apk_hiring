package com.ichsan.value.screen.offer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ichsan.value.R
import com.ichsan.value.databinding.FragmentOfferBinding


class OfferFragment : Fragment() {

private lateinit var binding: FragmentOfferBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_offer, container, false)
        return binding.root
    }

}