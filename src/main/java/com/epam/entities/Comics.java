package com.epam.entities;

public class Comics extends Magazine {
    private String illustratorName;

    public Comics(int pages, int yearOfPublishing, String title, Magazine.PageType pageType, String illustratorName) {

        super(pages, yearOfPublishing, title, pageType);
        this.illustratorName = illustratorName;
    }
}
