package com.flow.abstr;

public class Main {
    public static void main(String[] args) {
        Chicken pipi = new Chicken("Pipi");
        Shark jaw = new Shark("Jaw");
        Clownfish nemo = new Clownfish("Nemo");
        Wolf akira = new Wolf("Akira");
        Animals[] livingBeings = new Animals[] {pipi, jaw, nemo, akira};
        for (int i = 0; i < livingBeings.length; i++) {
            System.out.println(livingBeings[i].getClass());
        }
        System.out.println(pipi.sound());
        System.out.println(jaw.sound());
        System.out.println(nemo.sound());
        System.out.println(akira.sound());
        TerrestialAnimals[] dustWalkers = new TerrestialAnimals[] {pipi, akira};
        AquaticAnimals[] waterBreathers = new AquaticAnimals[] {jaw, nemo};
        Carnivore[] meatEaters = new Carnivore[] {jaw, akira};
        Herbivore[] plantGrazers = new Herbivore[] {nemo, pipi};
    }
}
