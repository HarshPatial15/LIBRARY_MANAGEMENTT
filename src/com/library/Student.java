package com.library;

public class Student extends User {

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void showMenu() {
        System.out.println("Student Menu:");
        // Options for viewing and searching books, borrowing, etc.
    }

    public void borrowBook(Library library, Book book) {
        if (library.borrowBook(book)) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Library library, Book book) {
        library.returnBook(book, this);
    }
}
