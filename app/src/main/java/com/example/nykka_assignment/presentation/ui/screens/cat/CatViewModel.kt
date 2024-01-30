package com.example.nykka_assignment.presentation.ui.screens.cat

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nykka_assignment.domain.model.Cat
import com.example.nykka_assignment.network.repository.CatRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CatViewModel : ViewModel() {

    private val catRepo = CatRepositoryImpl();
    private val _catStateFlow = MutableStateFlow<List<Cat>>(emptyList());

    val catStateFlow: StateFlow<List<Cat>>
        get() = _catStateFlow.asStateFlow()

    fun getCatList() = viewModelScope.launch {
        val catResponse = catRepo.getCats(10)
        _catStateFlow.emit(catResponse)
    }

}
