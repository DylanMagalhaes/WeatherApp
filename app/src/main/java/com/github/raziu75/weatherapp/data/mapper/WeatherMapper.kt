package com.github.raziu75.weatherapp.data.mapper

import com.github.raziu75.weatherapp.data.response.WeatherResponse
import com.github.raziu75.weatherapp.ui.model.WeatherModel


fun WeatherResponse.toModel(): WeatherModel {
    val mainWeather = this.list[0].main
    val weatherDescription = this.list[0].weatherList[0]
    return WeatherModel(
        temperature = mainWeather.temperature,
        humidity = mainWeather.humidity,
        pressure = mainWeather.pressure,
        description = weatherDescription.description,
        icon = weatherDescription.icon,
        id = weatherDescription.id
    )
}
