package org.example;

public class Java14 {
    public static class Book {
        String title;
        String author;
        Double price;

        public Book() {
            this.title =  "Unknown";
            this.author = "Unknown";
            this.price = 0.0;
        }

        public Book(String title, String author){
            this.title =  title;
            this.author = author;
            this.price = 0.0;
        }

        public Book(String title, String author, Double price){
            this.title =  title;
            this.author = author;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2= new Book("Amatka", "Karin Tidbeck");
        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18.9);
        System.out.println("book1 Title: " + book1.title + " Author: " + book1.author + " Price: " + book1.price);
        System.out.println("book2 Title: " + book2.title + " Author: " + book2.author + " Price: " + book2.price);
        System.out.println("book3 Title: " + book3.title + " Author: " + book3.author + " Price: " + book3.price);
    }
}
