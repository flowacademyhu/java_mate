package com.flow.classes;

public class Human {
    Human (String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Human () {
        name = "Józsi";
        age = 28;
        gender = true;
    }

    Human (String name) {
        this.name = name;
    }

    private String name;
    private int age;
    private boolean gender;


    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }

    void sayHi() {
        if (this.gender) {
            System.out.println("Hi! My name is " + name + ". I'm currently " + age + " old. And I'm a guy.");
        } else {
            System.out.println("Hi! My name is " + name + ". I'm currently " + age + " old. And I'm a girl.");

        }
    }

    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int newAge) {
        if (newAge < 0) {
            this.age = newAge;
        } else {
            System.out.println("Age must be a positive number");
        }
    }

    public static void goesToPub () {
        System.out.println("I went to get WASTED!");
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
