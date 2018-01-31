package com.epam.creators;

import com.epam.exceptions.NotBookException;
import com.epam.entities.FictionBook;
import com.epam.utils.BookValidator;
import com.epam.utils.FictionBookValidator;
import com.epam.utils.PrintedEditionValidator;

import java.util.Iterator;
import java.util.List;

public class FictionBookCreator {
    public FictionBook create(List<String> list) throws NotBookException {
        Iterator<String> iterator = list.iterator();
        iterator.next();

        String title = BookValidator.checkTitle(iterator.next());
        String author = BookValidator.checkAuthor(iterator.next());
        Integer pages = PrintedEditionValidator.checkPages(iterator.next());
        Integer yearOfPublishing = PrintedEditionValidator.checkYearOfPublishing(iterator.next());
        Integer minAge = FictionBookValidator.checkMinAge(iterator.next());

        if (title != null && author != null && pages != null && yearOfPublishing != null && minAge != null)
                return new FictionBook(pages, yearOfPublishing, title, author, minAge);
        throw new NotBookException("Неверные данные");
    }

}
