package com.bignerdranch.android.lesson29.model

data class DataX(
    val id: String,
    val films: ArrayList<String>,
    val shortFilms: ArrayList<String>,
    val tvShows: ArrayList<String>,
    val videoGames: ArrayList<String>,
    val parkAttractions: ArrayList<String>,
    val allies: ArrayList<String>,
    val enemies: ArrayList<String>,
    val name: String,
    val imageUrl: String,
    val url: String

)