package com.epam.entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<PrintedEdition> list;

    public Library() {
        list = new ArrayList<>();
    }

    public void add(PrintedEdition printedEdition) {
        list.add(printedEdition);

    }
}
