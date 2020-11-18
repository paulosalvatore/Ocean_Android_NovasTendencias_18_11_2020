package com.oceanbrasil.ocean_android_novastendencias_18_11_2020.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.R
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.databinding.ActivityMainBinding
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.viewmodel.GameViewModel
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.viewmodel.GameViewModelFactory

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
    }

    private val viewModel by lazy {
        ViewModelProvider(
            this,
            GameViewModelFactory()
        ).get(GameViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadBindingVariables()
    }

    private fun loadBindingVariables() {
        binding.viewModel = viewModel
    }
}
