package com.bignerdranch.android.lesson29.repository

import com.bignerdranch.android.lesson29.network.CharacterListApi
import javax.inject.Inject

class CharacterListRepository @Inject constructor(
    private val characterListApi: CharacterListApi
) {

    suspend fun getCharacterList() = characterListApi.getCharacterList()

    suspend fun getCharacter(id: String) = characterListApi.getCharacter(id)
}