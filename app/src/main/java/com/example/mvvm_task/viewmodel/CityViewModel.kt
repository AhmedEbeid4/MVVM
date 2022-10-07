package com.example.mvvm_task.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_task.model.City
import com.example.mvvm_task.model.CityDataProvider

class CityViewModel : ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val cities = CityDataProvider().getCities()
    private var index = 0
    private val delay = 1000L

    init {
        loop()
    }

    fun getCityData(): LiveData<City> = cityData

    private fun loop() {
        Handler(Looper.getMainLooper()).postDelayed({
            updateCity()
        }, delay)
    }

    private fun updateCity() {
        index++
        if(index == cities.size){
            index =0
        }
        cityData.value = cities[index]
        loop()
    }
}