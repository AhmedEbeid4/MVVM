package com.example.mvvm_task.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.example.mvvm_task.databinding.ActivityMainBinding
import com.example.mvvm_task.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private val model:CityViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        model.getCityData().observe(this, Observer { city ->
            binding.cityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources,city.img,applicationContext.theme )
            )
            binding.cityName.text=city.name
            binding.population.text= city.population.toString()
        })
    }
}