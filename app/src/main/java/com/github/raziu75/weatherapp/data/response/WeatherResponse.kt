package com.github.raziu75.weatherapp.data.response

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("list") val list: List<WeatherDetail>
) {
    data class WeatherDetail(
        @SerializedName("main") val main: WeatherMain

    ) {
        data class WeatherMain(
            @SerializedName("temp") val temperature: Float,
            @SerializedName("humidity") val humidity: Int,
            @SerializedName("pressure") val pressure: Int,

        )
    }
}

