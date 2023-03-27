package com.github.raziu75.weatherapp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.raziu75.weatherapp.ui.model.WeatherModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeatherCard(
    modifier: Modifier.Companion,
    weatherModel: WeatherModel?,
) {

    Surface(
        modifier = modifier
            .height(320.dp)
            .width(320.dp),
        shadowElevation = 2.dp,
        shape = MaterialTheme.shapes.medium,
        tonalElevation = 4.dp,
        onClick = {}
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.fillMaxWidth(),
                text = "Paris",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )

            Spacer(modifier.height(30.dp))

            Text(
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.fillMaxWidth(),
                text = " ${weatherModel?.temperature?.toInt()}°",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )


            if (weatherModel != null) {
                Image(
                    painter = painterResource(id = weatherModel.icon),
                    contentDescription = null,
                    modifier = Modifier
                        .height(64.dp)
                        .width(64.dp)
                )
            }
            Text(
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.fillMaxWidth(),
                text = "${weatherModel?.description}",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )

            Spacer(modifier.height(30.dp))

            Text(
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.fillMaxWidth(),
                text = " Pressure: ${weatherModel?.pressure}hPa",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )


            Text(
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.fillMaxWidth(),
                text = " Humidity: ${weatherModel?.humidity}%",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )

        }
    }
}

