package com.api.unit_converter.units.weight;

public class Pound implements IWeight {
    @Override
    public double toMilligram(float value) {
        return value * 453600;
    }

    @Override
    public double toGram(float value) {
        return value * 453.6;
    }

    @Override
    public double toKilogram(float value) {
        return value / 2.205;
    }

    @Override
    public double toOunce(float value) {
        return value * 16;
    }

    @Override
    public double toPound(float value) {
        return value;
    }
}
