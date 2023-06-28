package com.bignerdranch.android.lesson29.ui_screens.charactersList

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.bignerdranch.android.lesson29.model.Character
import com.bignerdranch.android.lesson29.navigation.CHARACTER_SCREEN


@Composable
fun CharacterListScreen(
    navController: NavHostController,
    viewModel: CharacterListViewModel = viewModel()
) {
    val list = viewModel.listCharacters.observeAsState()
    viewModel.getList()
    val context: Context = LocalContext.current

    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(list.value ?: arrayListOf()) {
            CharacterItem(it) {
                navController.navigate("$CHARACTER_SCREEN/${it.id}")
                Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
            }
        }
    }
}

@Composable
fun CharacterItem(
    character: Character,
    onClick: (() -> Unit)
) {
    Column(
        modifier = Modifier
            .selectable(
                true, true, null, onClick
            )
    ) {
        Text(
            text = character.name
        )
        Spacer(modifier = Modifier.height(16.dp))
    }


}