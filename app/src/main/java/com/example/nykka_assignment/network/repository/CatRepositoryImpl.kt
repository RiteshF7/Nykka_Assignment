package com.example.nykka_assignment.network.repository

import com.example.nykka_assignment.domain.model.Cat
import com.example.nykka_assignment.network.CatService
import com.example.nykka_assignment.network.RetroFitBuilder
import com.example.nykka_assignment.network.model.CatDtoMapper

class CatRepositoryImpl(

) : CatRepository {

    override suspend fun getCats(limit: Int): List<Cat> {
        var catService = RetroFitBuilder.getRetroFit().create(CatService::class.java)
        return CatDtoMapper().fromDtoList(
            catService.get(limit)
        )
    }
}
