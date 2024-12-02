package com.enaitzdam.appmvvmzero

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {


    fun countAlumnes(edat: Int): Int {
        val total = AlumneProvider.getTotalAlumnes()
        var totalAlumnes = 0

        for (i in 0 until total) {
            val alumne = AlumneProvider.count()
            if (alumne.edat == edat) {
                totalAlumnes++
            }
        }

        return totalAlumnes
    }



}