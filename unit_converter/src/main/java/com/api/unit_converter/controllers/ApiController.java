package com.api.unit_converter.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.unit_converter.MyData;
import com.api.unit_converter.Validation;
import com.api.unit_converter.converters.LengthConverter;
import com.api.unit_converter.converters.TempConverter;
import com.api.unit_converter.converters.WeightConverter;
import com.api.unit_converter.units.length.ILength;
import com.api.unit_converter.units.temperature.ITemp;
import com.api.unit_converter.units.weight.IWeight;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/unit-converter")
public class ApiController {

    private List<String> lengthUnits = Arrays.asList("millimeter", "centimeter", "meter",
            "kilometer", "inch", "foot", "yard", "mile");

    private List<String> weightUnits = Arrays.asList("milligram", "gram", "kilogram",
            "ounce", "pound");
    
    private List<String> tempUnits = Arrays.asList("celsius", "fahrenheit", "kelvin");

    @GetMapping("/length")
    public Map<String, Object> getLengthUnits() {
        Map<String, Object> lengthMap = new HashMap<>();
        lengthMap.put("units-for-length", lengthUnits);
        return lengthMap;
    }

    @PostMapping("/length")
    public Map<String, Object> convertLength(@RequestBody MyData data) {

        Map<String, Object> errors = Validation.validateData(data, lengthUnits, "length");

        if (!errors.isEmpty()) {
            return errors;
        }

        String fromLength = data.getFrom();
        String toLength = data.getTo();
        Float value = Float.valueOf(data.getValue().toString());

        Optional<ILength> optional = LengthConverter.getiLength(fromLength);
        ILength l = null;
        Double result = Double.NaN;
        l = optional.get();
        result = LengthConverter.convert(toLength, value, l);

        Map<String, Object> response = new HashMap<>();

        response.put("from", fromLength);
        response.put("to", toLength);
        response.put("value", value);
        response.put("result", result);

        return response;
    }

    @GetMapping("/weight")
    public Map<String, Object> getWeightUnits() {
        Map<String, Object> weightMap = new HashMap<>();
        weightMap.put("units-for-weight", weightUnits);
        return weightMap;
    }

    @PostMapping("/weight")
    public Map<String, Object> convertWeight(@RequestBody MyData data) {

        Map<String, Object> errors = Validation.validateData(data, weightUnits, "weight");

        if (!errors.isEmpty()) {
            return errors;
        }

        String fromWeigth = data.getFrom();
        String toWeigth = data.getTo();
        float value = Float.valueOf(data.getValue().toString());

        Optional<IWeight> optional = WeightConverter.getiWeight(fromWeigth);
        IWeight w = null;
        Map<String, Object> response = new HashMap<>();

        w = optional.get();
        double result = WeightConverter.convert(toWeigth, value, w);

        response.put("from", fromWeigth);
        response.put("to", toWeigth);
        response.put("value", value);
        response.put("result", result);
        return response;
    }

    @GetMapping("/temperature")
    public Map<String, Object> getTempUnits() {
        Map<String, Object> tempMap = new HashMap<>();
        tempMap.put("units-for-temperatur", tempUnits);
        return tempMap;
    }

    @PostMapping("/temperature")
    public Map<String, Object> convertTemp(@RequestBody MyData data) {

        Map<String, Object> errors = Validation.validateData(data, tempUnits, "temperature");

        if (!errors.isEmpty()) {
            return errors;
        }

        String fromTemp = data.getFrom();
        String toTemp = data.getTo();
        float value = Float.valueOf(data.getValue().toString());

        Optional<ITemp> optional = TempConverter.getiTemp(fromTemp);
        ITemp t = null;
        Map<String, Object> response = new HashMap<>();

        t = optional.get();
        double result = TempConverter.convert(toTemp, value, t);

        response.put("from", fromTemp);
        response.put("to", toTemp);
        response.put("value", value);
        response.put("result", result);
        return response;
    }
}
