package com.epam.utils;

public class FictionBookValidator {
    public static Integer checkMinAge(String stringForValidation) {
        try {
            String tmp[] = stringForValidation.split("=");
            if (tmp.length == 2 && tmp[0].trim().equals("minAge") && Integer.parseInt(tmp[1]) >= 0)
                return Integer.parseInt(tmp[1]);
        } catch (NumberFormatException nfe) {
        }
        return null;
    }
}
