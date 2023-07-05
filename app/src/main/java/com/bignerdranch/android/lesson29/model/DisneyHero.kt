package com.bignerdranch.android.lesson29.model

data class DisneyHero(
    val allies: List<Any>,
    val createdAt: String?,
    val enemies: List<Any>,
    val films: List<String>,
    val _id: Int,
    val imageUrl: String,
    val name: String,
    val parkAttractions: List<String>,
    val shortFilms: List<String>,
    val sourceUrl: String?,
    val tvShows: List<String>,
    val updatedAt: String?,
    val url: String,
    val v: Int?,
    val videoGames: List<String>
)