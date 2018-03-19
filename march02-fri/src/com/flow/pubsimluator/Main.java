package com.flow.pubsimluator;

public class Main {
    public static void main(String[] args) {
        Human Pisti = new Human("Pisti", 22, true, 30);
        Human Feri = new Human("Feri", 24, true, 1000);
        Human Mari = new Human("Mari", 45, false, 15);

        Barkeep Béla = new Barkeep("Béla", 15, true, 50);
        Barkeep Kati = new Barkeep("Kati", 18, false, 600);

        Bouncer Boris = new Bouncer("Boris", 30, true, 30, true);
        Bouncer Katya = new Bouncer("Katya", 28, false, 40, false);

        Student Bálint = new Student("Bálint", 27, true, 15, 50);
        Student Anna = new Student("Anna", 31, false, 200, 150);


        System.out.println(Pisti);
        System.out.println(Feri);
        System.out.println(Mari);
        System.out.println(Béla);
        System.out.println(Kati);
        System.out.println(Bálint);
        System.out.println(Anna);
        System.out.println(Boris);
        System.out.println(Katya);
    }
}
