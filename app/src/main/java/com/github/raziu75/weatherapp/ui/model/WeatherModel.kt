package com.github.raziu75.weatherapp.ui.model

data class WeatherModel(
    val temperature: Float,
    val humidity: Int,
    val pressure: Int,
    val description: String,
    val icon: String,
    val id :Int

    )
