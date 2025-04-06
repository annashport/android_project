package com.example.myyyyapplication.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myyyyapplication.databinding.FragmentPlanBinding
import com.example.myyyyapplication.presentation.GroupType
import com.example.myyyyapplication.presentation.adapters.LikedAdapter
import com.example.myyyyapplication.presentation.fragments.clubsfragments.GroupedClubsFragment.Companion.GROUP_BY_TYPE
import com.example.myyyyapplication.presentation.viewmodel.GroupedClubsViewModel
import com.example.myyyyapplication.presentation.viewmodel.PlanViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf


class PlanFragment : Fragment() {

    private var _binding: FragmentPlanBinding? = null
    private val binding get() = _binding!!

    private val vm: PlanViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.calendarView.setOnDateSelectedListener {
            println("selected day = $it")
        }
        subscribeToLikedWorkshops()
    }

    private fun subscribeToLikedWorkshops() {
        vm.likedWorkshopsLiveData.observe(viewLifecycleOwner) {
            binding.rvLiked.layoutManager = LinearLayoutManager(context)
            binding.rvLiked.adapter = LikedAdapter(it.toMutableList()) { workshop ->
                vm.updateWorkshop(workshop)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}