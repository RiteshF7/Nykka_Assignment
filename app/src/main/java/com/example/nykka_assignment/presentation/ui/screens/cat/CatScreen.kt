package com.example.nykka_assignment.presentation.ui.screens.cat

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.example.nykka_assignment.domain.model.Cat

@Composable
fun CatScreen(viewModel: CatViewModel) {

    val cats = viewModel.catStateFlow.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.getCatList()
    }

    LazyColumn(content = {
        items(cats.value) {cat->
                CatItem(cat = cat)
        }
    })
}