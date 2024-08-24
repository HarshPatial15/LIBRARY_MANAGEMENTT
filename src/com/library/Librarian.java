package com.library;

public class Librarian extends User {

    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public void showMenu() {
        System.out.println("Librarian Menu:");
        // Options for managing book lending, returns, etc.
    }

    public void lendBook(Library library, Book book, Student student) {
        library.lendBook(book, student);
    }

    public void returnBook(Library library, Book book, Student student) {
        library.returnBook(book, student);
    }
}
