package com.github.raziu75.weatherapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import com.github.raziu75.weatherapp.ui.model.WeatherModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    model: WeatherModel?,

) {
    Box(contentAlignment = Alignment.Center,
        modifier = modifier
            .background(Color(0xFF6200EE))
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        WeatherCard(
            modifier = Modifier,
            weatherModel = model,
        )

    }
}


