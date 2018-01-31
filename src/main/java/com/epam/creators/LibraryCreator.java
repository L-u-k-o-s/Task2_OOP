package com.epam.creators;

import com.epam.actions.DataReader;
import com.epam.entities.Library;
import com.epam.entities.PrintedEdition;

import java.io.FileNotFoundException;
import java.util.List;

public class LibraryCreator {
    public Library create(String path) throws FileNotFoundException {
            DataReader dataReader = new DataReader();
            List<String> data = dataReader.getData(path);
            PrintedEditionCreator printedEditionCreator = new PrintedEditionCreator();
            Library library = new Library();
            for (String string : data) {
                PrintedEdition printedEdition = printedEditionCreator.createPrintedEdition(string);
                if (printedEdition != null)
                    library.add(printedEdition);
            }
            return library;

    }
}
