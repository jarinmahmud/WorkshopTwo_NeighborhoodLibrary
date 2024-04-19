package com.ps;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // Creating an array to hold 20 books
            Book[] inventory = new Book[20];

            // Populating the inventory with books
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
