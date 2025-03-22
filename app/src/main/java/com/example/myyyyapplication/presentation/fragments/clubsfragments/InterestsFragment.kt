package com.example.myyyyapplication.presentation.fragments.clubsfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.myyyyapplication.R
import com.example.myyyyapplication.databinding.FragmentInterestsBinding
import com.example.myyyyapplication.presentation.viewmodel.InterestsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class InterestsFragment : Fragment() {

    private var _binding: FragmentInterestsBinding? = null
    private val binding get() = _binding!!

    private val vm: InterestsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInterestsBinding.inflate(inflater, container, false)
        val view = binding.root
        val expandButtons = listOf(
            binding.expandButton,
            binding.expandButton2,
            binding.expandButton3,
            binding.expandButton4,
            binding.expandButton5,
            binding.expandButton6,
            binding.expandButton7,
            binding.expandButton8
        )

        val infoLayouts = listOf(
            binding.infoLayout,
            binding.infoLayout2,
            binding.infoLayout3,
            binding.infoLayout4,
            binding.infoLayout5,
            binding.infoLayout6,
            binding.infoLayout7,
            binding.infoLayout8
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
        subscribeToWorkshops()
        return view
    }

    private fun subscribeToWorkshops() {
        vm.workshopsLiveData.observe(viewLifecycleOwner) {
            // todo populate UI
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}