package com.github.raziu75.weatherapp.data

import com.github.raziu75.weatherapp.data.response.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "457e9f3f58bfeb73bab6aed595591f4a"

interface WeatherApiService {
    @GET("forecast")
    suspend fun getForecast(
        @Query("q") q: String = "Paris",
        @Query("lang") lang: String = "fr",
        @Query("units") units: String = "metric",
        @Query("appid") appid: String = API_KEY,
    ): Result<WeatherResponse>
}


