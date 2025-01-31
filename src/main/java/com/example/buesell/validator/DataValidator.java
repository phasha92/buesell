package com.example.buesell.validator;

import java.util.regex.Pattern;

public class DataValidator {

    private DataValidator() {
    }

    public static boolean isValid(String value,ValidRule rule) {
        if (value == null || value.trim().isEmpty()) {
            return false;
        }
        return Pattern.compile(rule.getValue()).matcher(value).matches();
    }
    public static boolean isValid(Integer value,ValidRule rule) {
        if(value != null){
            String valueStr = value.toString();
            return Pattern.compile(rule.getValue()).matcher(valueStr).matches();
        }
            return false;
    }
}
