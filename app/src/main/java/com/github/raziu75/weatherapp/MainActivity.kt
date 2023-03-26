package com.github.raziu75.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.github.raziu75.weatherapp.data.RetrofitHelper
import com.github.raziu75.weatherapp.data.WeatherRepository
import com.github.raziu75.weatherapp.ui.composable.MainScreen
import com.github.raziu75.weatherapp.ui.model.WeatherModel

class MainActivity : ComponentActivity() {


    val repository = WeatherRepository(RetrofitHelper().buildApiService())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var weather by remember { mutableStateOf<WeatherModel?>(null) }
            LaunchedEffect(Unit) {
                repository.getForecast()
                    .onSuccess {
                        weather = it
                        println(weather!!.temperature)
                    }.onFailure { println("CA MARCHE PAS !") }
            }

            MainScreen(model = weather)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}