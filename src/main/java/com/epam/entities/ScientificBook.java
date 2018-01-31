package com.epam.entities;


public class ScientificBook extends Book {
    private String scienceField;

    @Override
    public String toString() {
        return "ScientificBook{" + "pages=" + super.getPages() +
                ", yearOfPublishing=" + super.getYearOfPublishing() + ", title=\'" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                "scienceField='" + scienceField + '\'' +
                '}';
    }

    public ScientificBook() {
    }

    public ScientificBook(int pages, int yearOfPublishing, String title, String author, String scienceField) {

        super(pages, yearOfPublishing, title, author);
        this.scienceField = scienceField;
    }
}
