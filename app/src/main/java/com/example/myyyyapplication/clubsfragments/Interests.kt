package com.example.myyyyapplication.clubsfragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.example.myyyyapplication.DatabaseInitializer
import com.example.myyyyapplication.MyDatabase
import com.example.myyyyapplication.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Interests : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_interests, container, false)

        DatabaseInitializer.populateDatabase(requireContext(), viewLifecycleOwner, "Клуб 1")

        val clubNameTextView = view.findViewById<TextView>(R.id.clubNameTextView)
        val clubAddressTextView = view.findViewById<TextView>(R.id.clubAddressTextView)
        val clubPhoneTextView = view.findViewById<TextView>(R.id.clubPhoneTextView)
        val clubWebsiteTextView = view.findViewById<TextView>(R.id.clubWebsiteTextView)

        val database = MyDatabase.getDatabase(requireContext())

        lifecycleScope.launch {
            delay(1000) // Додайте затримку
            val club = database.myDao().getClubByName("Клуб 1") // Замініть "Клуб 1" на назву гуртка, який ви хочете відобразити

            if (club != null) {
                Log.d("Interests", "Club found: ${club.name}")
                clubNameTextView.text = club.name
                clubAddressTextView.text = club.address
                clubPhoneTextView.text = club.phone
                clubWebsiteTextView.text = club.website
            } else {
                Log.d("Interests", "Club not found")
            }
        }

        return view

    }


}