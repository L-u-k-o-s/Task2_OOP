package com.epam.entities;

public abstract class Magazine extends PrintedEdition {
    private String title;
    public enum PageType {GLOSSY_PAPER, ORIGINAL_PAPER}
    private PageType pageType;

    public Magazine(int pages, int yearOfPublishing, String title, PageType pageType) {
        super(pages, yearOfPublishing);
        this.title = title;
        this.pageType = pageType;
    }


}
