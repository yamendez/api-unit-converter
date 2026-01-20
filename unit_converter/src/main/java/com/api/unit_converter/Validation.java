package com.api.unit_converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validation {

    

    public static Map<String, Object> validateData(MyData data, List<String> unitList, String validUnit) {
        Map<String, Object> errors = new HashMap<>();

        if (data.getFrom() == null || data.getFrom().equals("")) {
            errors.put("null-first-unit", "You must enter the first unit of measurement.");
        }

        if (data.getFrom() == null || data.getTo().equals("")) {
            errors.put("null-second-unit", "You must enter the second unit of measurement.");
        }

        if (data.getValue() == null || data.getValue().equals("")) {
            errors.put("null-value", "You must enter a value to convert.");
        }

        if (!isNumeric(data.getValue().toString())) {
            errors.put("invalid-value", data.getValue().toString() + " is not a valid value.");
        }

        if (!unitList.contains(data.getFrom())) {
            errors.put("invalid-first-unit", data.getFrom() + " is not a valid unit of measurement for "+validUnit+".");
        }

        if (!unitList.contains(data.getTo())) {
            errors.put("invalid-second-unit", data.getTo() + " is not a valid unit of measurement for "+validUnit+".");
        }

        return errors;
    }

    public static boolean isNumeric(String value) {
        boolean result;
        try {
            Float.parseFloat(value);
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }
}
