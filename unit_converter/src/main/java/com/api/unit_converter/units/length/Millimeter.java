package com.api.unit_converter.units.length;

public class Millimeter implements ILength{

    @Override
    public double toMillimeter(float value) {
        return value;
    }

    @Override
    public double toCentimeter(float value) {
        return value / 10;
    }

    @Override
    public double toMeter(float value) {
        return value / 1000;
    }

    @Override
    public double toKilometer(float value) {
        return value / 1e+6;
    }

    @Override
    public double toInch(float value) {
        return value / 25.4f;
    }

    @Override
    public double toFoot(float value) {
        return value / 304.8f;
    }

    @Override
    public double toYard(float value) {
        return value / 914.4f;
    }

    @Override
    public double toMile(float value) {
        return value / 1.609e+6;
    }

}
