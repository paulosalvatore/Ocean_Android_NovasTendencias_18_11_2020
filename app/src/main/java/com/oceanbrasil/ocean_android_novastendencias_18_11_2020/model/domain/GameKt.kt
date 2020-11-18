package com.oceanbrasil.ocean_android_novastendencias_18_11_2020.model.domain

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.delegates.bindable

class GameKt(
    name: String,
    val launchYear: Int,
    val imageUrl: String = "URL_IMAGEM_DEFAULT"
) : BaseObservable() {

    @get:Bindable
    var name by bindable(name, BR.name)
}
