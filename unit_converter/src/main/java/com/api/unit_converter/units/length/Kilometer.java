package com.api.unit_converter.units.length;

public class Kilometer implements ILength{

    @Override
    public double toMillimeter(float value) {
        return value * 1e+6;
    }

    @Override
    public double toCentimeter(float value) {
        return value * 100000;
    }

    @Override
    public double toMeter(float value) {
        return value * 1000;
    }

    @Override
    public double toKilometer(float value) {
        return value;
    }

    @Override
    public double toInch(float value) {
        return value * 39370;
    }

    @Override
    public double toFoot(float value) {
        return value * 3281;
    }

    @Override
    public double toYard(float value) {
        return value * 1094;
    }

    @Override
    public double toMile(float value) {
        return value / 1.609;
    }

}
