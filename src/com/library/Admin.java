package com.library;

public class Admin extends User {

    public Admin(String name, String id) {
        super(name, id);
    }

    @Override
    public void showMenu() {
        System.out.println("Admin Menu:");
        // Options for managing users, books, etc.
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(Library library, Book book) {
        library.removeBook(book);
        System.out.println("Book removed successfully.");
    }
}
