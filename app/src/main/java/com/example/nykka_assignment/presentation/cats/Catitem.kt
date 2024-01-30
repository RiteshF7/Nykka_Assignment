package com.example.nykka_assignment.presentation.cats

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun getItemElement(imageId: Int, imageUrl: String) {
    Card() {
        Column {
            Text(imageUrl)

        }

    }
}