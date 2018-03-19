package com.flow.classes;

public class Main {
    public static void main(String[] args) {
        Human Jozsi = new Human();
        System.out.println(Jozsi);
        Human Katka = new Human("Katka", 20, false);
        System.out.println(Katka);
        Human Peti = new Human("Peti");
        System.out.println(Peti);
        Human Anna = new Human("Anna", 18, false);
        Jozsi.sayHi();
        Anna.sayHi();
        System.out.println(Peti.getName());
        System.out.println(Human.numberOfCreations);
        Human.goesToPub();
    }
}
