package com.flow.abstr;

public abstract class AquaticAnimals extends Animals{
    public AquaticAnimals(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Cannot be heard under the water";
    }
}
