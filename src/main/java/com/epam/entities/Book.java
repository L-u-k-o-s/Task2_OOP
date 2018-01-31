package com.epam.entities;

public abstract class Book extends PrintedEdition {
    private String title;
    private String author;

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int pages, int yearOfPublishing, String title, String author) {
        super(pages, yearOfPublishing);
        this.title = title;
        this.author = author;
    }


}
