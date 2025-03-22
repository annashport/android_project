package com.example.myyyyapplication.clubsfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myyyyapplication.R
import com.example.myyyyapplication.databinding.FragmentPricesBinding


class Prices : Fragment() {

    private var _binding: FragmentPricesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPricesBinding.inflate(inflater, container, false)
        val view = binding.root

        val expandButtons = listOf(
            binding.expandButton,
            binding.expandButton2,
            binding.expandButton3
        )

        val infoLayouts = listOf(
            binding.infoLayout,
            binding.infoLayout2,
            binding.infoLayout3
        )

        for (i in expandButtons.indices) {
            expandButtons[i].setOnClickListener {
                if (infoLayouts[i].visibility == View.GONE) {
                    infoLayouts[i].visibility = View.VISIBLE
                    expandButtons[i].setImageResource(R.drawable.arrow_up_24)
                } else {
                    infoLayouts[i].visibility = View.GONE
                    expandButtons[i].setImageResource(R.drawable.arrow_down_24)
                }
            }
        }

        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}