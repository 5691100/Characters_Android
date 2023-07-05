package com.bignerdranch.android.lesson29.util

import com.bignerdranch.android.lesson29.model.*
import com.bignerdranch.android.lesson29.model.Character


fun DisneyHero.toCharacter(): Character {
    return (Character(
        _id.toString(),
        name,
        imageUrl
    )
            )
}

fun List<DisneyHero>.toCharacterList(): ArrayList<Character> =
    map {
        it.toCharacter()
    } as ArrayList<Character>


//fun DataXX.toCharacter(): DataX {
//    return DataX(
//        data["_id"].toString(),
//        (data["films"]) as ArrayList<String>,
//        (data["shortFilms"]) as ArrayList<String>,
//        (data["tvShows"]) as ArrayList<String>,
//        (data["videoGames"]) as ArrayList<String>,
//        (data["parkAttractions"]) as ArrayList<String>,
//        (data["allies"]) as ArrayList<String>,
//        (data["enemies"]) as ArrayList<String>,
//        data["name"].toString(),
//        data["imageUrl"].toString(),
//        data["url"].toString()
//    )
//}
