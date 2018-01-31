package com.epam.entities;

public class FictionBook extends Book {
    private int minAge;

    public FictionBook(int pages, int yearOfPublishing, String title, String author, int minAge) {
        super(pages, yearOfPublishing, title, author);
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public FictionBook() {
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "pages=" + super.getPages() +
                ", yearOfPublishing=" + super.getYearOfPublishing() + ", title=\'" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", minAge=" + minAge +
                '}';
    }


}
