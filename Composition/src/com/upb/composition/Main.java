package com.upb.composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Library UPB!!!");

        Book b1 = new Book("Effective Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        List<Book> book = new ArrayList<Book>(); // List<Book>book = []
        book.add(b1);
        book.add(b2);
        book.add(b3);

        // Creating an object of class 2
        Library library = new Library(book);

        List<Book> books
                = library.getListOfBooksInLibrary();

        // Iterating over for each loop
        for (Book bk : books) {
            System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
        }
    }
}
