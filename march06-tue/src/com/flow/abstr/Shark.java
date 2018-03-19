package com.flow.abstr;

public class Shark extends AquaticAnimals implements Carnivore{
    public Shark(String name) {
        super(name);
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
