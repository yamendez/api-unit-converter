package com.api.unit_converter.converters;

import java.util.Optional;

import com.api.unit_converter.units.weight.*;

public class WeightConverter {
    public static Double convert(String toWeight, float fromValue, IWeight w) {
        Double toValue = 0d;
        switch (toWeight) {
            case "milligram" -> {
                toValue = w.toMilligram(fromValue);
            }
            case "gram" -> {
                toValue = w.toGram(fromValue);
            }
            case "kilogram" -> {
                toValue = w.toKilogram(fromValue);
            }
            case "ounce" -> {
                toValue = w.toOunce(fromValue);
            }
            case "pound" -> {
                toValue = w.toPound(fromValue);
            }
            default -> {
                toValue = Double.NaN;
            }
        }
        return toValue;
    }

    public static Optional<IWeight> getiWeight(String fromWeight) {
        IWeight w = null;

        switch (fromWeight) {
            case "milligram" -> {
                w = new Milligram();
            }
            case "gram" -> {
                w = new Gram();
            }
            case "kilogram" -> {
                w = new Kilogram();
            }
            case "ounce" -> {
                w = new Ounce();
            }
            case "pound" -> {
                w = new Pound();
            }
        }
        return Optional.ofNullable(w);
    } 
}
