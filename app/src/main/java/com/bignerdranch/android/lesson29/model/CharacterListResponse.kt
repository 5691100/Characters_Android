package com.bignerdranch.android.lesson29.model

data class CharacterListResponse(
    val `data`: List<DisneyHero>,
    val info: Info
)