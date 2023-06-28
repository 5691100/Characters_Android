package com.bignerdranch.android.lesson29.ui_screens.characterInfo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.bignerdranch.android.lesson29.model.DataX
import com.bignerdranch.android.lesson29.repository.CharacterListRepository
import com.bignerdranch.android.lesson29.util.toCharacter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val characterListRepository: CharacterListRepository
) : ViewModel() {

    val character = MutableLiveData<DataX>()

    fun getCharacter(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = characterListRepository.getCharacter(id)
            if (response.isSuccessful) {
                character.postValue(response.body()?.toCharacter())
        }
    }
}
}