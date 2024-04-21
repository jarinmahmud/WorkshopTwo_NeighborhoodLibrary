package com.ps;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Method to check out the book
    public void checkOut(String name) {
        isCheckedOut = true;
        checkedOutTo = name;
    }

    // Method to check in the book
    public void checkIn() {
        isCheckedOut = false;
        checkedOutTo = "";
    }

    @Override
    public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Title: " + title + ", Checked Out: " + isCheckedOut +
                (isCheckedOut ? ", Checked Out To: " + checkedOutTo : "");
    }
}
