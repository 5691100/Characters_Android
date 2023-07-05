package com.bignerdranch.android.lesson29.ui_screens.characterInfo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.bignerdranch.android.lesson29.model.DisneyHero
import com.bignerdranch.android.lesson29.repository.CharacterListRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val characterListRepository: CharacterListRepository
) : ViewModel() {


    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        throwable.printStackTrace()
    }
    val character = MutableLiveData<DisneyHero>()

    fun getCharacter(id: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            val response = characterListRepository.getCharacter(id)
            if (response.isSuccessful) {
                character.postValue(response.body()?.data)
            }
        }
    }
}