package com.oceanbrasil.ocean_android_novastendencias_18_11_2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.ocean_android_novastendencias_18_11_2020.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Tipo de classe de Binding gerada:
        // ActivityMainBinding

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        val viewModel =
            ViewModelProvider(this, GameViewModelFactory())
                .get(GameViewModel::class.java)

        binding.viewModel = viewModel
    }
}
