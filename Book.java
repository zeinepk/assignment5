package com.company;

public class Book {
    private int bookId;
    private String name;
    private int rating;
    private int amount;

    public Book(int bookId, String name, int rating, int amount) {
        this.bookId = bookId;
        this.name = name;
        this.rating = rating;
        this.amount = amount;
    }

    public String isPopular() {
        if( rating <= 1 ) {
            return name + " not such popular";
        }
        else if ( rating <= 2 ) {
            return name + " not popular";
        }
        else if ( rating <= 3 ) {
            return name + " is okay";
        }
        else if ( rating <= 4 ) {
            return name + " kinda popular";
        }
        else {
            return name + " is a bestseller";
        }
    }

    public String isAvailable() {
        if ( amount == 0) {
            return "No such a book";
        }
        else if ( amount <= 5 ) {
            return "There such a book, but you should hurry";
        }
        else {
            return "No worry we have such a book";
        }
    }
}
