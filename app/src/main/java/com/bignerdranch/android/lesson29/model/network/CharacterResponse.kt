package com.bignerdranch.android.lesson29.model.network

data class CharacterResponse(
    val info: HashMap<String, String>,
    val data: HashMap<String, ArrayList<String>>
)