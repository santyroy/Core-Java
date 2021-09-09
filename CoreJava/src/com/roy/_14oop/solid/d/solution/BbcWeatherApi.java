package com.roy._14oop.solid.d.solution;

public class BbcWeatherApi implements WeatherSource {

    public double getTemperatureFahrenheit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getTemperatureCelsius() {
        return toCelsius(getTemperatureFahrenheit());
    }

    private double toCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
