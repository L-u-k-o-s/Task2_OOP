package com.epam.creators;

import com.epam.entities.FictionBook;
import com.epam.entities.ScientificBook;
import com.epam.exceptions.NotBookException;
import com.epam.utils.BookValidator;
import com.epam.utils.PrintedEditionValidator;
import com.epam.utils.ScientificBookValidator;

import java.util.Iterator;
import java.util.List;

public class ScientificBookCreator {
    public ScientificBook create(List<String> list) throws NotBookException {
        Iterator<String> iterator = list.iterator();
        iterator.next();

        String title = BookValidator.checkTitle(iterator.next());
        String author = BookValidator.checkAuthor(iterator.next());
        Integer pages = PrintedEditionValidator.checkPages(iterator.next());
        Integer yearOfPublishing = PrintedEditionValidator.checkYearOfPublishing(iterator.next());
        String scienceField = ScientificBookValidator.checkScienceField(iterator.next());

        if (title != null && author != null && pages != null && yearOfPublishing != null && scienceField != null)
            return new  ScientificBook(pages, yearOfPublishing, title, author, scienceField);
        throw new NotBookException("Неверные данные");
    }
}
