package com.library;

public class Main {
    public static void main(String[] args) {
        // Create a library object
        Library library = new Library();

        // Create some users
        Admin admin = new Admin("Alice", "A001");
        Librarian librarian = new Librarian("Bob", "L001");
        Student student1 = new Student("Charlie", "S001");
        Student student2 = new Student("Diana", "S002");

        // Add users to the library
        library.getUsers().add(admin);
        library.getUsers().add(librarian);
        library.getUsers().add(student1);
        library.getUsers().add(student2);

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001");
        Book book2 = new Book("1984", "George Orwell", "ISBN002");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN003");

        // Add books to the library
        admin.addBook(library, book1);
        admin.addBook(library, book2);
        admin.addBook(library, book3);

        // Display all books in the library
        System.out.println("Books available in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Student borrows a book
        student1.borrowBook(library, book1);

        // Display all books in the library after borrowing
        System.out.println("\nBooks available in the library after borrowing:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Student returns the book
        student1.returnBook(library, book1);

        // Display all books in the library after returning
        System.out.println("\nBooks available in the library after returning:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
