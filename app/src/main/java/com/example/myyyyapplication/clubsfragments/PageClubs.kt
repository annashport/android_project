package com.example.myyyyapplication.clubsfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.myyyyapplication.R


class PageClubs : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page_clubs, container, false)
    }
//Навігація по кніпочкам
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bInterests = view.findViewById<Button>(R.id.button_Interests)
        val bPrices = view.findViewById<Button>(R.id.button_prices)
        val bDays = view.findViewById<Button>(R.id.button_days)
        val bHours = view.findViewById<Button>(R.id.button_hours)
        val controller = findNavController()
        bInterests.setOnClickListener { controller.navigate(R.id.interests) }
        bPrices.setOnClickListener { controller.navigate(R.id.prices) }
        bDays.setOnClickListener { controller.navigate(R.id.days) }
        bHours.setOnClickListener { controller.navigate(R.id.hours) }


}


}