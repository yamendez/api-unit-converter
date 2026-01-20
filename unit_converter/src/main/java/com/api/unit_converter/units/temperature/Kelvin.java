package com.api.unit_converter.units.temperature;

public class Kelvin implements ITemp{
    @Override
    public double toCelsius(float value) {
        return value - 273.15;
    }

    @Override
    public double toFahrenheit(float value) {
        return (value - 273.15) * ((double) 9/5) + 32;
    }

    @Override
    public double toKelvin(float value) {
        return value;
    }
}
