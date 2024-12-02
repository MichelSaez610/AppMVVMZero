package com.enaitzdam.appmvvmzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.enaitzdam.appmvvmzero.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)

        val homeViewModel = HomeViewModel()

        binding.button.setOnClickListener{
            val input = binding.inputEdat.text.toString()
            val numero = input.toInt()
            val totalAlumnes = homeViewModel.countAlumnes(numero)

            binding.totalALumnes.setText("Total d'alumnes amb aquesta edat: " + totalAlumnes)
        }

        return binding.root

    }


}