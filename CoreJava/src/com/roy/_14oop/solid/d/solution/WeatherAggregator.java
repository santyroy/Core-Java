package com.roy._14oop.solid.d.solution;

/*
    Let say we need to add another API WorldWeather which returns temperature in Kelvin.
    So we need to add another method in WeatherAggregator to convert Kelvin->Celsius.
    Also, our WeatherAggregator depends on each weather API.
 */

import java.util.Arrays;

public class WeatherAggregator {

    private WeatherSource[] weatherSources;

    public WeatherAggregator(WeatherSource[] weatherSources) {
        this.weatherSources = weatherSources;
    }

    public double getTemperature() {
        return Arrays.stream(weatherSources)
                .mapToDouble(WeatherSource::getTemperatureCelsius)
                .average().getAsDouble();
    }
}
