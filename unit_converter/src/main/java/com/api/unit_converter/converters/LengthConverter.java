package com.api.unit_converter.converters;

import java.util.Optional;

import com.api.unit_converter.units.length.*;

public class LengthConverter {
    public static double convert(String toLength, float fromValue, ILength l) {
        double toValue = 0;
        switch (toLength) {
            case "millimeter" -> {
                toValue = l.toMillimeter(fromValue);
            }
            case "centimeter" -> {
                toValue = l.toCentimeter(fromValue);
            }
            case "meter" -> {
                toValue = l.toMeter(fromValue);
            }
            case "kilometer" -> {
                toValue = l.toKilometer(fromValue);
            }
            case "inch" -> {
                toValue = l.toInch(fromValue);
            }
            case "foot" -> {
                toValue = l.toFoot(fromValue);
            }
            case "yard" -> {
                toValue = l.toYard(fromValue);
            }
            case "mile" -> {
                toValue = l.toMile(fromValue);
            }
            default -> {
                toValue = Double.NaN;
            }
        }
        return toValue;
    }

    public static Optional<ILength> getiLength(String fromLength) {
        ILength l = null;

        switch (fromLength) {
            case "millimeter" -> {
                l = new Millimeter();
            }
            case "centimeter" -> {
                l = new Centimeter();
            }
            case "meter" -> {
                l = new Meter();
            }
            case "kilometer" -> {
                l = new Kilometer();
            }
            case "inch" -> {
                l = new Inch();
            }
            case "foot" -> {
                l = new Foot();
            }
            case "yard" -> {
                l = new Yard();
            }
            case "mile" -> {
                l = new Mile();
            }
        }
        return Optional.ofNullable(l);
    } 
}
