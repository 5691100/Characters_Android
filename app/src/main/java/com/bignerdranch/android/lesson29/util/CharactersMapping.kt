package com.bignerdranch.android.lesson29.util

import com.bignerdranch.android.lesson29.model.network.CharactersListResponse
import com.bignerdranch.android.lesson29.model.Character
import com.bignerdranch.android.lesson29.model.DataX
import com.bignerdranch.android.lesson29.model.network.CharacterResponse

fun CharactersListResponse.toCharacterList(): ArrayList<Character> {
    val list = arrayListOf<Character>()
    data.forEach { (id, hashMap) ->
        list.add(
            Character(
                hashMap["_id"].toString(),
                hashMap["name"].toString(),
                hashMap["imageUrl"].toString()
            )
        )
    }
    return list
}

fun CharacterResponse.toCharacter(): DataX {
    return DataX(
        data["_id"].toString(),
        (data["films"]) as ArrayList<String>,
        (data["shortFilms"]) as ArrayList<String>,
        (data["tvShows"]) as ArrayList<String>,
        (data["videoGames"]) as ArrayList<String>,
        (data["parkAttractions"]) as ArrayList<String>,
        (data["allies"]) as ArrayList<String>,
        (data["enemies"]) as ArrayList<String>,
        data["name"].toString(),
        data["imageUrl"].toString(),
        data["url"].toString()
    )
}
