package com.github.raziu75.weatherapp.data

import com.github.raziu75.weatherapp.data.mapper.toModel
import com.github.raziu75.weatherapp.ui.model.WeatherModel

class WeatherRepository(private val service: WeatherApiService) {

    suspend fun getForecast(): Result<WeatherModel> {

        return service.getForecast().map { it.toModel() }
    }
}