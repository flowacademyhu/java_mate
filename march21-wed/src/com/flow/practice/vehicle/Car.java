package com.flow.practice.vehicle;

final public class Car extends Vehicle implements Motorized{
    private int fuel;

    public Car(int weight, int maxSpeed) {
        super(weight, maxSpeed);
        fuel = 50;
    }

    @Override
    public void go() throws BrokeDownException {
        if (isBrokeDown()) {
            throw new BrokeDownException("Sadly this car is broken.");
        }
        if (fuel <= 0) {
            throw new NoFuelException("You ran out of fuel.");
        }
        System.out.println("Car starting up without a problem.");
        fuel -= 10;
    }

    @Override
    public void fillTheTank(int fill) {
        if (fuel + fill <=50) {
            fuel += fill;
        } else {
            fuel = 50;
        }
    }

    @Override
    public int getFuel() {
        return fuel;
    }
}
