package com.flow.practice.vehicle;

public class FreightTrain extends Train {
    private String cargo;
    private int load;

    public FreightTrain(String origin, String destination, int distance, int averageSpeed, String cargo, int load) {
        super(origin, destination, distance, averageSpeed);
        this.cargo = cargo;
        this.load = load;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Freight practice: " + cargo +
                " (" + load + " t), " +
                origin + " - " + destination +
                " (distance: " + distance +
                " km), average speed: "+ averageSpeed + " km/h";
    }
}
