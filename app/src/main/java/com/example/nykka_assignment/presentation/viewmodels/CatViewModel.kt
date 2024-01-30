package com.example.nykka_assignment.presentation.catlist

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CatViewModel : ViewModel() {

    private val catRepo = CatRepositoryImpl();
    private val _stateFlow = MutableStateFlow(ScreenState())

    val stateFlow: StateFlow<ScreenState>
        get() = _stateFlow.asStateFlow()

    fun getCatList(){
        catRepo
    }

}
