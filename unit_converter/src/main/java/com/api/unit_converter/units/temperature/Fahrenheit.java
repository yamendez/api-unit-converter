package com.api.unit_converter.units.temperature;

public class Fahrenheit implements ITemp{
    @Override
    public double toCelsius(float value) {
        return (value - 32) * ((double) 5/9);
    }

    @Override
    public double toFahrenheit(float value) {
        return value;
    }

    @Override
    public double toKelvin(float value) {
        return (value - 32) * ((double) 5/9) + 273.15;
    }
}
