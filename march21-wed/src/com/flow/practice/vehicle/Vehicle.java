package com.flow.practice.vehicle;

public abstract class Vehicle {
    private int weight;
    private int maxSpeed;
    private boolean brokeDown;

    public Vehicle(int weight, int maxSpeed) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isBrokeDown() {
        return brokeDown;
    }

    public void setBrokeDown(boolean brokeDown) {
        this.brokeDown = brokeDown;
    }

    @Override
    public String toString() {
        if (!brokeDown) {
            return "This vehicle wieghs " + weight + "kg and can go with a max speed of " + maxSpeed + "km/h and is working.";
        }
        return "This vehicle wieghs " + weight + "kg and can go with a max speed of " + maxSpeed + "km/h and is not working.";
    }

    public abstract void go() throws BrokeDownException;
}
