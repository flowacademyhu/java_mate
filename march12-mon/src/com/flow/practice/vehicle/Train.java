package com.flow.practice.vehicle;

public class Train {
    protected String origin;
    protected String destination;
    protected float distance;
    protected int averageSpeed;

    public Train(String origin, String destination, int distance, int averageSpeed) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public float earliest () {
        return distance / averageSpeed;
    }

    @Override
    public String toString() {
        return origin + " - " + destination +
                " (distance: " + distance +
                " km), average speed: " + averageSpeed + " km/h";
    }
}
