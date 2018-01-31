package com.epam.entities;

public abstract class PrintedEdition {
    private int pages;
    private int yearOfPublishing;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrintedEdition)) return false;
        PrintedEdition that = (PrintedEdition) o;
        return getPages() == that.getPages() &&
                getYearOfPublishing() == that.getYearOfPublishing();
    }

    @Override
    public int hashCode() {

        return ((Integer) getPages()).hashCode() + ((Integer) getYearOfPublishing()).hashCode();
    }

    public PrintedEdition() {
    }

    @Override
    public String toString() {
        return "PrintedEdition{" +
                "pages=" + pages +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }

    public PrintedEdition(int pages, int yearOfPublishing) {
        this.pages = pages;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getPages() {
        return pages;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
