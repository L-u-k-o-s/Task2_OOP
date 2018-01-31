package com.epam.utils;

public class PrintedEditionValidator {
    public static Integer checkPages(String stringForValidation) {
        String tmp[] = stringForValidation.split("=");
        try {
            if (tmp.length == 2 && tmp[0].trim().equals("pages")&&Integer.parseInt(tmp[1])>0)
                return Integer.parseInt(tmp[1]);
        } catch (NumberFormatException nfe) {
        }
        return null;
    }

    public static Integer checkYearOfPublishing(String stringForValidation) {
        String tmp[] = stringForValidation.split("=");
        try {
            if (tmp.length == 2 && tmp[0].trim().equals("yearOfPublishing")&&Integer.parseInt(tmp[1])>0 && Integer.parseInt(tmp[1])<=2018)
                return Integer.parseInt(tmp[1]);
        } catch (NumberFormatException nfe) {
        }
        return null;
    }
}
