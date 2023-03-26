package com.github.raziu75.weatherapp.data

import com.github.raziu75.weatherapp.data.adapter.ResultCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    private val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) // utiliser Gson pour la conversion
        .addCallAdapterFactory(ResultCallAdapterFactory()) // utiliser Result
        .build()


    fun buildApiService(): WeatherApiService {
        return retrofit.create(WeatherApiService::class.java)
    }
}