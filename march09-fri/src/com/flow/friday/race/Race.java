package com.flow.friday.race;

import com.flow.friday.race.vehicle.Car;
import com.flow.friday.race.vehicle.Formula1;

public class Race {
    public static void main(String[] args) {
        Car[] cars = new Car[args.length / 5];
        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            Formula1 racer = new Formula1(args[i], args[i+1],
                    Integer.parseInt(args[i+2]), Integer.parseInt(args[i+3]),
                    Float.parseFloat(args[i+4]));
            cars[counter] = racer;
            i += 4;
            counter++;
        }

        Car[] topThree = new Car[3];
        int first;
        for (int i = 0; i < 3; i++) {
            first = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].competitiveness() > cars[first].competitiveness()) {
                    first = j;
                }
            }
            if (cars[i] != cars[first]) {
                Car temp = cars[i];
                cars[i] = cars[first];
                cars[first] = temp;
            }
            topThree[i] = cars[i];
        }

        for (int i = 0; i < 3; i++) {
            tellMeCar(topThree[i]);
        }
    }

    public static void tellMeCar (Car car) {
        System.out.println(car);
    }
}
