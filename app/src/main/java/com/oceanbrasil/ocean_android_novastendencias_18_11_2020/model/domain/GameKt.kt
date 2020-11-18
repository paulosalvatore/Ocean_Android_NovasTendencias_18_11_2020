package com.oceanbrasil.ocean_android_novastendencias_18_11_2020.model.domain

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class GameKt(
    name: String,
    val launchYear: Int,
    val imageUrl: String = "URL_IMAGEM_DEFAULT"
) : BaseObservable() {
    @get:Bindable
    var name = name
        set(value) {
            if (field != value) {
                field = value
                notifyPropertyChanged(BR.name)
            }
        }
}
