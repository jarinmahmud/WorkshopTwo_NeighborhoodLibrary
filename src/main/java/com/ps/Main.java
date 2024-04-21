package com.ps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //array to hold the inventory of books
        Book[] inventory = new Book[20];

        inventory[0] = new Book(1, "IBN12345","To Kill a Mockingbird", true, "Daniel");
        inventory[1] = new Book(2, "IBN23456", "The Knight Runner", false, "");
        inventory[2] = new Book(3, "IBN23458", "The Alchemist", true, "Jarin");
        inventory[3] = new Book(4, "IBN23459", "The Notebook", false, "");
        inventory[4] = new Book(5, "IBN23457", "A-Z Dictionary", true, "Yianna");
        inventory[5] = new Book(6, "IBN23454", "Little Mermaid", false, "");
        inventory[6] = new Book(7, "IBN234234", "Bedtime Stories for kids", true, "Monica");
        inventory[7] = new Book(8, "IBN234560", "Two Sisters", false, "");
        inventory[8] = new Book(9, "IBN23456", "Stars Have Fallen", true, "Syed");
        inventory[9] = new Book(10, "IBN236753", "Learn ABCD", false, "");
        inventory[10] = new Book(11, "IBN23469", "Atomic Habits", true, "Sergio");
        inventory[11] = new Book(12, "IBN23655", "Rich Dad Poor Dad", false, "");
        inventory[12] = new Book( 13,"IBN23238", "The Brief History of Time", true, "Jeremy");
        inventory[13] = new Book(14, "IBN23789", "History of Vikings", false, "");
        inventory[14] = new Book( 15,"IBN23250", "Travel Stories", true, "Justin");
        inventory[15] = new Book(16, "IBN23407", "The Song of Fire and Ice", false, "");
        inventory[16] = new Book(17, "IBN23146", "The Power of Letting Go", true, "Courtezz");
        inventory[17] = new Book(18, "IBN23458", "Ikigai", false, "");
        inventory[18] = new Book(19, "IBN23467", "It Ends With Us", true, "Henry");
        inventory[19] = new Book(20, "IBN23446", "The Keeper of Stars", false, "");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Home screen options
            System.out.println("Welcome to Neighborhood Library!");
            System.out.println("1. Show Available books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //new line

            switch (choice) {
                case 1:
                    showAvailableBooks(inventory, scanner);
                    break;
                case 2:
                    showCheckedOutBooks(inventory, scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using Neighborhood Library.");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    // Method to show available books
    private static void showAvailableBooks(Book[] inventory, Scanner scanner) {
        System.out.println("Available Books:");
        for (Book book : inventory) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
        System.out.println("Enter the ID of the book you want to check out (or enter 0 to go back):");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // newline
        if (bookId == 0) {
            return; // Return to home screen if 0 is entered
        }
        if (bookId < 1 || bookId > inventory.length) {
            System.out.println("Invalid book ID.");
            return;
        }
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        inventory[bookId - 1].checkOut(name);
        System.out.println("Book checked out successfully!");
    }

    // Method to show checked out books
    private static void showCheckedOutBooks(Book[] inventory, Scanner scanner) {
        System.out.println("Checked Out Books:");
        for (Book book : inventory) {
            if (book.isCheckedOut()) {
                System.out.println(book);
            }
        }
        System.out.println("Enter the ID of the book you want to check in (or enter 0 to go back):");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // newline
        if (bookId == 0) {
            return; // Return to home screen if 0 is entered
        }
        if (bookId < 1 || bookId > inventory.length) {
            System.out.println("Invalid book ID.");
            return;
        }
        inventory[bookId - 1].checkIn();
        System.out.println("Book checked in successfully!");
    }
}