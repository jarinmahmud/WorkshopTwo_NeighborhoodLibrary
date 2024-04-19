package com.ps;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // Creating an array to hold 20 books
            Book[] inventory = new Book[20];

            // Populating the inventory with books
            inventory[0] = new Book(1, "IBN12345","To Kill a Mockingbird", "");
            inventory[1] = new Book(2, "IBN23456", "The Knight Runner", "");
            inventory[2] = new Book(2, "IBN23458", "The Alchemist", "");
            inventory[3] = new Book(2, "IBN23459", "The Notebook", "");
            inventory[4] = new Book(2, "IBN23457", "A-Z Dictionary", "");
            inventory[5] = new Book(2, "IBN23454", "Little Mermaid", "");
            inventory[6] = new Book(2, "IBN234234", "Bedtime Stories for kids", "");
            inventory[7] = new Book(2, "IBN234560", "Two Sisters", "");
            inventory[8] = new Book(2, "IBN23456", "Stars Have Fallen", "");
            inventory[9] = new Book(2, "IBN236753", "Learn ABCD", "");
            inventory[10] = new Book(2, "IBN23469", "Atomic Habits", "");
            inventory[11] = new Book(2, "IBN23655", "Rich Dad Poor Dad", "");
            inventory[12] = new Book(2, "IBN23238", "The Brief History of Time", "");
            inventory[13] = new Book(2, "IBN23789", "History of Vikings", "");
            inventory[14] = new Book(2, "IBN23250", "Travel Stories", "");
            inventory[15] = new Book(2, "IBN23407", "The Song of Fire and Ice", "");
            inventory[16] = new Book(2, "IBN23146", "The Power of Letting Go", "");
            inventory[17] = new Book(2, "IBN23458", "Ikigai", "");
            inventory[18] = new Book(2, "IBN23467", "It Ends With Us", "");
            inventory[19] = new Book(2, "IBN23446", "The Keeper of Stars", "");

            // Add more books as needed

            // Displaying the inventory
            System.out.println("Inventory of Books:");
            for (Book book : inventory) {
                if (book != null) {
                    System.out.println(book);
                }
            }
            int command;
            System.out.println("Please choose an option: ");
            System.out.println("\t1) Show Available Books");
            System.out.println("\t2) Show Checked out Books");
            System.out.println("\t3) Exit");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();

            switch(command){
                case 1:
                    System.out.println("Here is the available books");
                    break;
                case 2:
                    System.out.println("Here is the checked out books");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Command not found");
            }
        }


//        do{
//            //show available books
//            do{
//
//            } while ();
//            //Shoe checked out books
//            do {
//
//            }while();
//            //check in books
//            do{
//
//            }while();
//        }while();
    }
