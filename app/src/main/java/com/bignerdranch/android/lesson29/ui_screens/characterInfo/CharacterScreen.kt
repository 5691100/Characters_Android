package com.bignerdranch.android.lesson29.ui_screens.characterInfo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController


@Composable
fun CharacterScreen(
    navController: NavHostController,
    id: String,
    viewModel: CharacterViewModel = viewModel()
) {
    val character = viewModel.character.observeAsState()
    viewModel.getCharacter(id)

    Column {
        Button (onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Back")
        }
//        navController.navigate(CHARACTER_SCREEN)
        Text(text = character.value?.name ?: "")
        Text(text = "Hey!")
    }
//    fun getCategories(): String {
//        val categories = arrayListOf<String>()
//        for (category in character.value?.categories!!) {
//            categories.add(category.categoryName)
//        }
//        return categories.toString()
}






