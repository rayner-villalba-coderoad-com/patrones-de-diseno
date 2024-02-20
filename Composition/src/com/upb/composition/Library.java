package com.upb.composition;

import java.util.List;

public class Library {
    private String name;
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getListOfBooksInLibrary() {
        return books;
    }
}
