package com.api.unit_converter.converters;

import java.util.Optional;

import com.api.unit_converter.units.temperature.*;

public class TempConverter {
    public static Double convert(String toTemp, float fromValue, ITemp t) {
        Double toValue = 0d;
        switch (toTemp) {
            case "celsius" -> {
                toValue = t.toCelsius(fromValue);
            }
            case "fahrenheit" -> {
                toValue = t.toFahrenheit(fromValue);
            }
            case "kelvin" -> {
                toValue = t.toKelvin(fromValue);
            }
            default -> {
                toValue = Double.NaN;
            }
        }
        return toValue;
    }

    public static Optional<ITemp> getiTemp(String fromTemp) {
        ITemp t = null;

        switch (fromTemp) {
            case "celsius" -> {
                t = new Celsius();
            }
            case "fahrenheit" -> {
                t = new Fahrenheit();
            }
            case "kelvin" -> {
                t = new Kelvin();
            }
        }
        return Optional.ofNullable(t);
    } 
}
