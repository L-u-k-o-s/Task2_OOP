package com.epam.utils;

public class BookValidator {
    public static String checkTitle(String stringForValidation) {
        String tmp[] = stringForValidation.split("=");
        if (tmp.length == 2 && tmp[0].trim().equals("title"))
            return tmp[1];
        return null;
    }
    public static String checkAuthor(String stringForValidation) {
        String tmp[] = stringForValidation.split("=");
        if (tmp.length == 2 && tmp[0].trim().equals("author"))
            return tmp[1];
        return null;
    }
}
