package com.flow.practice.book;

public class Novel extends Book{
    String Type;
    private static int novelCount = 0;

    public Novel(String title, String author, String publisher, int yearOfPublishing) {
        super(title, author, publisher, yearOfPublishing);
        Type = "ifjúsági";
        novelCount++;
    }

    public Novel(String title, String author, String publisher, int yearOfPublishing, String type) {
        super(title, author, publisher, yearOfPublishing);
        Type = type;
        novelCount++;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public static int getNovelCount() {
        return novelCount;
    }

    @Override
    public String toString() {
        return "Novel: Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Publisher: " + getPublisher() +
                ", YearOfPublishing: " + getYearOfPublishing() +
                ", Type: " + Type;
    }
}
