package com.oceanbrasil.ocean_android_novastendencias_18_11_2020.delegates

import androidx.databinding.BaseObservable
import kotlin.reflect.KProperty

fun <R : BaseObservable, T : Any> bindable(
    value: T, bindingRes: Int
): BindableDelegate<R, T> {
    return BindableDelegate(value, bindingRes)
}

class BindableDelegate<in R : BaseObservable, T : Any>(
    private var value: T, private val bindingEntry: Int
) {

    operator fun getValue(thisRef: R, property: KProperty<*>): T = value

    operator fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        this.value = value
        thisRef.notifyPropertyChanged(bindingEntry)
    }
}
