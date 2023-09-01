package com.example.appfinal

import androidx.lifecycle.ViewModel
import com.example.appfinal.ViewModel.MainViewModel
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class MainViewModelUnitTest {
    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun testcomparaStrings_StringsAreEqual(){
        val result = viewModel.comparaStrings("Hola", "Hola")
        assertEquals(true, result.areEqual)
    }

    @Test
    fun testcomparaStrings_StringsArNoteEqual() {
        val result = viewModel.comparaStrings("Hola", "Nombre")
        assertEquals(false, result.areEqual)
    }
}
