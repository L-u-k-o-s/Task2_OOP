package com.epam.creators;

import com.epam.exceptions.NotBookException;
import com.epam.entities.PrintedEdition;

import java.util.Arrays;
import java.util.List;

public class PrintedEditionCreator {
    public PrintedEdition createPrintedEdition(String tmp) {
        List<String> list = Arrays.asList(tmp.split("[:,]"));
        String className = list.get(0).trim();
        try {
            switch (className) {
                case "FictionBook":
                    return new FictionBookCreator().create(list);
                case "ScientificBook":
                    return new ScientificBookCreator().create(list);
                case "Comics":
                    break;
                default:
                    throw new NotBookException("");
            }
        } catch (NotBookException e) {
            //e.printStackTrace();
        }
        return null;
    }
}
