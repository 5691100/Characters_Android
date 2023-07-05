package com.bignerdranch.android.lesson29.ui_screens.charactersList

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.lesson29.model.Character
import com.bignerdranch.android.lesson29.repository.CharacterListRepository
import com.bignerdranch.android.lesson29.util.toCharacterList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val characterListRepository: CharacterListRepository
) : ViewModel() {



    val listCharacters = MutableLiveData<ArrayList<Character>>()

    fun getList() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = characterListRepository.getCharacterList()
            if (response.isSuccessful) {
                listCharacters.postValue(response.body()?.data?.toCharacterList())
            }
        }
    }
}