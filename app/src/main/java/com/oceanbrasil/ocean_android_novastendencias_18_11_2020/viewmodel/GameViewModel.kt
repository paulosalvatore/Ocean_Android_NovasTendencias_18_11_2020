package com.oceanbrasil.ocean_android_novastendencias_18_11_2020.viewmodel

import androidx.lifecycle.ViewModel
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.model.repository.GameRepository

class GameViewModel : ViewModel() {

    private val repository = GameRepository()

    val game = repository.game
}
