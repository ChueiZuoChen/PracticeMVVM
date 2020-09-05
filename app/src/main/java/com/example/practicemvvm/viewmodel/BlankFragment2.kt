package com.example.practicemvvm.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.practicemvvm.R
import kotlinx.android.synthetic.main.fragment_blank2.*

class BlankFragment2 :Fragment(){

    val args:BlankFragment2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tv_name.text = args.person?.name
        tv_age.text = args.person?.age.toString()

        return layoutInflater.inflate(R.layout.fragment_blank2,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button2.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment)
        }
    }
}