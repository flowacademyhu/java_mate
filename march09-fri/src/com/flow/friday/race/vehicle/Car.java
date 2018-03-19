package com.flow.friday.race.vehicle;

public class Car {
    protected int horsepower;
    protected int maxSpeed;
    protected String type;

    public Car(String type, int horsepower, int maxSpeed) {
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float competitiveness () {
        return horsepower + maxSpeed;
    }

    @Override
    public String toString() {
        return "Car (Type: " + type +
                ", Horsepower: " + horsepower +
                ", Maximum speed: " + maxSpeed +
                ", Competitiveness: " + competitiveness() + ")";
    }
}
