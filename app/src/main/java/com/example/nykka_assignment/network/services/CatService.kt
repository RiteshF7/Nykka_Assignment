package com.example.nykka_assignment.network

import com.example.nykka_assignment.network.model.CatDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CatService {
    @GET("images/search")
    suspend fun get(
        @Query("limit") limit: Int
    ): List<CatDto>
}