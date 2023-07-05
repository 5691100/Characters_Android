package com.bignerdranch.android.lesson29.ui_screens.characterInfo

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@Composable
fun CharacterScreen(
    navController: NavHostController,
    id: String,
    viewModel: CharacterViewModel = hiltViewModel()
) {
    val character = viewModel.character.observeAsState()
    viewModel.getCharacter(id)

    LazyColumn {
        item {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text(text = "Back")
            }
//        navController.navigate(CHARACTER_SCREEN)

            AsyncImage(
                model = character.value?.imageUrl,
                contentDescription = null
            )

            Text(text = character.value?.name ?: "")

            if (character.value?.films?.size != 0) {
                Text(text = "Films")
                Row {
                    Text(text = character.value?.films.toString())
                }
            }
            if (character.value?.shortFilms?.size != 0) {
                Text(text = "Short Films")
                Row {
                    Text(text = character.value?.shortFilms.toString())
                }
            }
            if (character.value?.tvShows?.size != 0) {
                Text(text = "TV shows")
                Row {
                    Text(text = character.value?.tvShows.toString())
                }
            }
            if (character.value?.videoGames?.size != 0) {
                Text(text = "Video Games")
                Row {
                    Text(text = character.value?.videoGames.toString())
                }
            }
            if (character.value?.parkAttractions?.size != 0) {
                Text(text = "Park Attractions")
                Row {
                    Text(text = character.value?.parkAttractions.toString())
                }
            }
            if (character.value?.allies?.size != 0) {
                Text(text = "Allies")
                Row {
                    Text(text = character.value?.allies.toString())
                }
            }
            if (character.value?.enemies?.size != 0) {
                Text(text = "Enemies")
                Row {
                    Text(text = character.value?.enemies.toString())
                }
            }
//    fun getCategories(): String {
//        val categories = arrayListOf<String>()
//        for (category in character.value?.categories!!) {
//            categories.add(category.categoryName)
//        }
//        return categories.toString()
        }
    }
}





