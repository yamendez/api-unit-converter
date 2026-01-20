package com.api.unit_converter.units.length;

public class Inch implements ILength {

    @Override
    public double toMillimeter(float value) {
        return value * 25.4;
    }

    @Override
    public double toCentimeter(float value) {
        return value * 2.54;
    }

    @Override
    public double toMeter(float value) {
        return value / 39.37;
    }

    @Override
    public double toKilometer(float value) {
        return value / 39370;
    }

    @Override
    public double toInch(float value) {
        return value;
    }

    @Override
    public double toFoot(float value) {
        return value / 12;
    }

    @Override
    public double toYard(float value) {
        return value / 36;
    }

    @Override
    public double toMile(float value) {
        return value / 63360;
    }

}
