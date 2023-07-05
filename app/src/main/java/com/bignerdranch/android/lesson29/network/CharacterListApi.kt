package com.bignerdranch.android.lesson29.network

import com.bignerdranch.android.lesson29.model.CharacterListResponse
import com.bignerdranch.android.lesson29.model.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterListApi {

    @GET("/character")
    suspend fun getCharacterList(): Response<CharacterListResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: String): Response<CharacterResponse>
}