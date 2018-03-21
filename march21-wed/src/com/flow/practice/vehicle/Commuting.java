package com.flow.practice.vehicle;

import java.util.ArrayList;

public class Commuting {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Bicycle csepel = new Bicycle(15);
        Bicycle peugeot = new Bicycle(5);
        peugeot.setBrokeDown(true);
        Car mazdaMx5 = new Car(1110, 210);
        Car opelInsignia = new Car(1500, 240);

        vehicles.add(csepel);
        vehicles.add(peugeot);
        vehicles.add(mazdaMx5);
        vehicles.add(opelInsignia);

        for (Vehicle vehicle: vehicles) {
            try {
                vehicle.go();
            } catch (BrokeDownException e) {
                e.printStackTrace();
            }
        }

        System.out.println();

        Vehicle trabant = new Car(650, 100);
        while (true) {
            try {
                trabant.go();
            } catch (BrokeDownException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
