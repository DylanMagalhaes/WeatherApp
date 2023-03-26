package com.github.raziu75.weatherapp.data.mapper

import com.github.raziu75.weatherapp.data.response.WeatherResponse
import com.github.raziu75.weatherapp.ui.model.WeatherModel


fun WeatherResponse.toModel(): WeatherModel {
    val mainWeather = this.list[0].main

    return WeatherModel(
        temperature = mainWeather.temperature,
        humidity = mainWeather.humidity,
        pressure = mainWeather.pressure
    )
}
