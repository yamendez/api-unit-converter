package com.api.unit_converter.units.length;

public class Mile implements ILength {

    @Override
    public double toMillimeter(float value) {
        return value * 1.609e+6;
    }

    @Override
    public double toCentimeter(float value) {
        return value *  160900;
    }

    @Override
    public double toMeter(float value) {
        return value * 1609;
    }

    @Override
    public double toKilometer(float value) {
        return value * 1.609;
    }

    @Override
    public double toInch(float value) {
        return value * 63360;
    }

    @Override
    public double toFoot(float value) {
        return value * 5280;
    }

    @Override
    public double toYard(float value) {
        return value * 1760;
    }

    @Override
    public double toMile(float value) {
        return value;
    }

}
