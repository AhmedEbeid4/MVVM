package com.example.mvvm_task.model

import com.example.mvvm_task.R

class CityDataProvider {
    private val cities= arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.bangkok,1000000))
        cities.add(City("London", R.drawable.london,21500000))
        cities.add(City("Paris", R.drawable.paris,178213))
        cities.add(City("New Your", R.drawable.newyork,91283))
        cities.add(City("Rio", R.drawable.rio,123123))
        cities.add(City("Rome", R.drawable.rome,1234412))
        cities.add(City("Singapore", R.drawable.singapore,987432))
        cities.add(City("Tokyo", R.drawable.tokyo,123098))
        cities.add(City("Sydney", R.drawable.sydney,2491))
    }
    fun getCities()=cities
}