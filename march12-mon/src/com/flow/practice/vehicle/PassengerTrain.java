package com.flow.practice.vehicle;

public class PassengerTrain extends Train{
    private int numberOfStops;

    public PassengerTrain(String origin, String destination, int distance, int averageSpeed, int numberOfStops) {
        super(origin, destination, distance, averageSpeed);
        setNumberOfStops(numberOfStops);
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        if (numberOfStops >= 2) {
            this.numberOfStops = numberOfStops;
        } else {
            System.out.println("There has to be at least 2 stops!");
        }
    }

    @Override
    public float earliest() {
        return super.earliest() + (numberOfStops - 2) * 0.1f;
    }

    @Override
    public String toString() {
        return "Passenger practice: " + numberOfStops +
                " stops, " + origin + " - " + destination +
                " (distance: " + distance +
                " km), average speed: "+ averageSpeed + " km/h";
    }
}
