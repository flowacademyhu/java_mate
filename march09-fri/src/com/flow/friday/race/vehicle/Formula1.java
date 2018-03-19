package com.flow.friday.race.vehicle;

import com.flow.friday.race.vehicle.Car;

final public class Formula1 extends Car {
    private String pilot;
    private float settings;

    public Formula1(String type, String pilot, int horsepower, int maxSpeed, float settings) {
        super(type, horsepower, maxSpeed);
        this.pilot = pilot;
        this.settings = settings;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public float getSettings() {
        return settings;
    }

    public void setSettings(float settings) {
        this.settings = settings;
    }

    @Override
    public float competitiveness() {
        return (horsepower + maxSpeed) * settings;
    }

    @Override
    public String toString() {
        return "Formula 1 (Type: " + type +
                ", Pilot: " + pilot +
                ", Horsepower: " + horsepower +
                ", Maximum speed: " + maxSpeed +
                ", Settings: " + settings +
                ", Competitiveness: " + competitiveness() + ")";
    }
}
