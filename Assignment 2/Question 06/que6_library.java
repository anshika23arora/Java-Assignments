package assignment2;

import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    // Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    // Constructor
    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\n" +
                "Price: " + price + "\n" +
                "Author: " + author;
    }
}

public class que6_library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book and author details:");
        System.out.println("Format: title,price,authorName,email,gender");

        String[] data = sc.nextLine().split(",");

        String title = data[0].trim();
        double price = Double.parseDouble(data[1].trim());
        String authorName = data[2].trim();
        String email = data[3].trim();
        char gender = data[4].trim().charAt(0);

        Author author = new Author(
                authorName,
                email,
                gender
        );

        Book book = new Book(
                title,
                price,
                author
        );

        System.out.println();
        System.out.println(book);

        sc.close();
    }
}