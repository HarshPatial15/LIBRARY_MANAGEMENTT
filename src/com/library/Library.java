package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void lendBook(Book book, Student student) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book lent to " + student.getName());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book, Student student) {
        books.add(book);
        System.out.println("Book returned by " + student.getName());
    }

    public boolean borrowBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }
}
