package com.example.appfinal.ViewModel

import androidx.lifecycle.ViewModel
import com.example.appfinal.model.ComparacionResultante

class MainViewModel: ViewModel() {

    fun comparaStrings(string1: String, string2: String): ComparacionResultante {
        val areStringEqual = string1 == string2
        return ComparacionResultante(areStringEqual)
    }
}