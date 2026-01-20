package com.api.unit_converter.units.length;

public class Centimeter implements ILength {

    @Override
    public double toMillimeter(float value) {
       return value * 10;
    }

    @Override
    public double toCentimeter(float value) {
        return value;
    }

    @Override
    public double toMeter(float value) {
        return value / 100;
    }

    @Override
    public double toKilometer(float value) {
        return value / 100000;
    }

    @Override
    public double toInch(float value) {
        return value / 2.54;
    }

    @Override
    public double toFoot(float value) {
        return value / 30.48;
    }

    @Override
    public double toYard(float value) {
        return value / 91.44;
    }

    @Override
    public double toMile(float value) {
        return value / 160900;
    }

}
