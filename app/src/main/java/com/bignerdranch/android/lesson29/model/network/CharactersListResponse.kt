package com.bignerdranch.android.lesson29.model.network

data class CharactersListResponse(
    val info: HashMap<String, String>,
    val data: HashMap<Int, HashMap<String, ArrayList<String>>>
)