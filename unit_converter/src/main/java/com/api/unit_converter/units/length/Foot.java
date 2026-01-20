package com.api.unit_converter.units.length;

public class Foot implements ILength {

    @Override
    public double toMillimeter(float value) {
        return value * 304.8;
    }

    @Override
    public double toCentimeter(float value) {
        return value * 30.48;
    }

    @Override
    public double toMeter(float value) {
        return value / 3.281;
    }

    @Override
    public double toKilometer(float value) {
        return value / 3281;
    }

    @Override
    public double toInch(float value) {
        return value * 12;
    }

    @Override
    public double toFoot(float value) {
        return value;
    }

    @Override
    public double toYard(float value) {
        return value / 3;
    }

    @Override
    public double toMile(float value) {
        return value / 5280;
    }

}
