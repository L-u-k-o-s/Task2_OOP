package com.epam.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    public List<String> getData(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path)).useDelimiter(";");
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        scanner.close();
        return list;
    }
}
