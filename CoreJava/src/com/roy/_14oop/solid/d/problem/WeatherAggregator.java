package com.roy._14oop.solid.d.problem;

/*
    Let say we need to add another API WorldWeather which returns temperature in Kelvin.
    So we need to add another method in WeatherAggregator to convert Kelvin->Celsius.
    Also, our WeatherAggregator depends on each weather API.
 */

public class WeatherAggregator {

    private AccuweatherApi accuweather = new AccuweatherApi();
    private BbcWeatherApi bbcWeather = new BbcWeatherApi();

    public double getTemperature() {
        return (accuweather.getTemperatureCelsius()
                + toCelsius(
                bbcWeather.getTemperatureFahrenheit())) / 2;
    }

    private double toCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
