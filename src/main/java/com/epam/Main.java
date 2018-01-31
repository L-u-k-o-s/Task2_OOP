package com.epam;

import com.epam.creators.LibraryCreator;
import com.epam.entities.FictionBook;
import com.epam.entities.Library;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        try {
            FictionBook book = new FictionBook();//100,1999, "Hi","Max",17);
            System.out.println(book);
            Library library=new LibraryCreator().create("input.txt");
            System.out.println(library);

//            Properties properties = new Properties();
//            properties.setProperty("type","yes");
//            new File("input.txt");
//            properties.setProperty("color","grey");
//            properties.load(new FileInputStream("input.txt"));
//
//            String tmp=new String("type=hi, color=red,  weight=3");
//properties.
//            Properties catalogProps = new Properties();
//            //catalogProps.load();
//            System.out.println(catalogProps.getProperty("type"));
//            System.out.println(properties.getProperty("color"));getProperty
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
