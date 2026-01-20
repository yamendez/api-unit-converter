package com.api.unit_converter.units.weight;

public class Gram implements IWeight {
    @Override
    public double toMilligram(float value) {
        return value * 1000;
    }

    @Override
    public double toGram(float value) {
        return value;
    }

    @Override
    public double toKilogram(float value) {
        return value / 1000;
    }

    @Override
    public double toOunce(float value) {
        return value / 28.35;
    }

    @Override
    public double toPound(float value) {
        return value / 453.6;
    }
}
