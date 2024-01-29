package com.harsh.jetpacknavigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.harsh.jetpacknavigation.R
import com.harsh.jetpacknavigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    var binding : FragmentSecondBinding ?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnMovetothird?.setOnClickListener(){
            findNavController().navigate(R.id.thirdFragment)
        }

    }
    companion object {

    }
}