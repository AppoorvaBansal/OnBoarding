package com.example.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_third, container, false)
        val viewPager2=activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.btnfinish.setOnClickListener {
            runBoard()
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)
        }

        return view
    }

    private fun runBoard() {
        val sharedpref =requireActivity().getSharedPreferences("check", Context.MODE_PRIVATE)
        val editor = sharedpref.edit()
        editor.putBoolean("finish",true)
        editor.apply()

    }


}