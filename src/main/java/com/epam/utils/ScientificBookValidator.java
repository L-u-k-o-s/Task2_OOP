package com.epam.utils;

public class ScientificBookValidator {
    public static String checkScienceField(String stringForValidation) {
        String tmp[] = stringForValidation.split("=");
        if (tmp.length == 2 && tmp[0].trim().equals("scienceField"))
            return tmp[1];
        return null;
    }
}

