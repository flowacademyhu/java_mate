package com.flow.practice.book;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;

    final protected String getTitle() {
        return title;
    }

    final protected void setTitle(String title) {
        this.title = title;
    }

    final protected String getAuthor() {
        return author;
    }

    final protected void setAuthor(String author) {
        this.author = author;
    }

    final protected String getPublisher() {
        return publisher;
    }

    final protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    final protected int getYearOfPublishing() {
        return yearOfPublishing;
    }

    final protected void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book() {
        title = "Objektumorientált Tervezés és Programozás";
        author = "Angster Erzsébet";
        publisher = "Kiskapu";
        yearOfPublishing = 2001;
    }

    public Book(String title, String author, String publisher, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book: Title: " + title +
                ", Author: " + author +
                ", Publisher: " + publisher +
                ", YearOfPublishing: " + yearOfPublishing;
    }
}
