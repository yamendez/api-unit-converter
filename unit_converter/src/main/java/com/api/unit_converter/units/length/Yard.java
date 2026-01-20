package com.api.unit_converter.units.length;

public class Yard implements ILength {

    @Override
    public double toMillimeter(float value) {
        return value * 914.4;
    }

    @Override
    public double toCentimeter(float value) {
        return value * 91.44;
    }

    @Override
    public double toMeter(float value) {
        return value / 1.094;
    }

    @Override
    public double toKilometer(float value) {
        return value * 1094;
    }

    @Override
    public double toInch(float value) {
        return value * 96;
    }

    @Override
    public double toFoot(float value) {
        return value * 3;
    }

    @Override
    public double toYard(float value) {
        return value;
    }

    @Override
    public double toMile(float value) {
        return value / 1760;
    }

}
