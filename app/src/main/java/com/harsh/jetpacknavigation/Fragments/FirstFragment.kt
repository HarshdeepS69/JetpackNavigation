package com.harsh.jetpacknavigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.harsh.jetpacknavigation.R
import com.harsh.jetpacknavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

var binding :FragmentFirstBinding ?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnMovetoSecond?.setOnClickListener(){
            findNavController().navigate(R.id.secondFragment)
        }
    }
    companion object {


    }
}