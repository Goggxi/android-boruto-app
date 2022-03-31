package com.goggxi.androidborutoapp.data.remote

import com.goggxi.androidborutoapp.domain.model.HeroResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BorutoApi {

    @GET("/boruto/heroes")
    suspend fun gatAllHeroes(
        @Query("page") page: Int = 1
    ): HeroResponse

    @GET("/boruto/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String
    ) : HeroResponse

}