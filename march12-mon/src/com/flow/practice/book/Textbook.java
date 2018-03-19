package com.flow.practice.book;

public class Textbook extends Book{
    private String subject;

    public Textbook(String title, String author, String publisher, int yearOfPublishing) {
        super(title, author, publisher, yearOfPublishing);
        subject = "Programozás 1";
    }

    public Textbook(String title, String author, String publisher, int yearOfPublishing, String subject) {
        super(title, author, publisher, yearOfPublishing);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Subject: " + subject;
    }
}
