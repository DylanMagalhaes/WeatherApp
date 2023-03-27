package com.github.raziu75.weatherapp.data.response

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("list") val list: List<WeatherDetail>
) {
    data class WeatherDetail(
        @SerializedName("main") val main: WeatherMain,
        @SerializedName("weather") val weatherList: List<WeatherWeather>

    ) {
        data class WeatherMain(
            @SerializedName("temp") val temperature: Float,
            @SerializedName("humidity") val humidity: Int,
            @SerializedName("pressure") val pressure: Int,

            )

        data class WeatherWeather(
            @SerializedName("description") val weatherDescription: String,
            @SerializedName("main") val description: String,
            @SerializedName("icon") val icon: String,
            @SerializedName("id") val id: Int,

        ) {

        }
    }
}

