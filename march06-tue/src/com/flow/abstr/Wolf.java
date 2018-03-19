package com.flow.abstr;

public class Wolf extends TerrestialAnimals implements Carnivore{
    public Wolf(String name) {
        super(name);
        setNumberOfLegs(4);
    }

    @Override
    public String sound() {
        return "howl";
    }

    @Override
    public void eat(Animals prey) {
        System.out.println(getName() + " just ate a " + prey);
        setFullness(100);
    }

    @Override
    public void rest(int howMuch) {
        System.out.println(getName() + " took a nap for " + howMuch);
        setStrength(getStrength() + howMuch);
    }
}
