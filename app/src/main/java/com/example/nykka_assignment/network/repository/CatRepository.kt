package com.example.nykka_assignment.network.repository

import com.example.nykka_assignment.domain.model.Cat

interface CatRepository {
    suspend fun getCats(limit:Int): List<Cat>
}