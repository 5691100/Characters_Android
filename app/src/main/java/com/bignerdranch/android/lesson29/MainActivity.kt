package com.bignerdranch.android.lesson29

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.bignerdranch.android.lesson29.navigation.NavGraph
import com.bignerdranch.android.lesson29.repository.CharacterListRepository
import com.bignerdranch.android.lesson29.ui.theme.Lesson29Theme
import com.bignerdranch.android.lesson29.ui_screens.charactersList.CharacterListScreen
import com.bignerdranch.android.lesson29.ui_screens.charactersList.CharacterListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var characterListRepository: CharacterListRepository

//    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lesson29Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    NavGraph(rememberNavController())
                }
            }
        }
//        lifecycleScope.launch(Dispatchers.IO) {
//            val result = characterListRepository.getCharacterList()
//            result
//        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lesson29Theme {
//        CharacterListScreen()
    }
}