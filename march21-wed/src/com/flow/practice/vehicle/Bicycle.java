package com.flow.practice.vehicle;

public class Bicycle extends Vehicle{
    public Bicycle(int weight) {
        super(weight, 40);
    }

    @Override
    public String toString() {
        if (!isBrokeDown()) {
            return "This Bicycle weighs " + getWeight() + "kg, has a max speed of 40km/h and it's functioning.";
        }
        return "This Bicycle weighs " + getWeight() + "kg, has a max speed of 40km/h and it's broke down.";
    }

    @Override
    public void go() throws BrokeDownException {
        if (isBrokeDown()) {
            throw new BrokeDownException("Sadly this Bicycle is broken");
        }
        System.out.println("Ready to roll! Let's go!");
    }
}
