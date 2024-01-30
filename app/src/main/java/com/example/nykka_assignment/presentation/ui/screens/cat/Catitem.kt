package com.example.nykka_assignment.presentation.ui.screens.cat

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import com.example.nykka_assignment.TextWidget
import com.example.nykka_assignment.domain.model.Cat

@Composable
fun CatItem(cat:Cat) {
    Card() {
        Column {
            TextWidget(title = cat.url)
            TextWidget(title = cat.id)
            TextWidget(title = cat.height.toString())
            TextWidget(title = cat.width.toString())

        }

    }
}