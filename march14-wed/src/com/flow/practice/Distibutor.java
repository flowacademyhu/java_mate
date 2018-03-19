package com.flow.practice;

import com.flow.practice.machines.DrinkMachine;

public class Distibutor {
    public static void main(String[] args) {
        DrinkMachine[] machines = new DrinkMachine[args.length/2];
        int machineCounter = 0;
        for (int i = 0; i < args.length; i += 2) {
            DrinkMachine temp = new DrinkMachine(Integer.parseInt(args[i]), Boolean.parseBoolean(args[i + 1]));
            machines[machineCounter] = temp;
            machineCounter++;
        }
        machines[0].putMoneyIn(100);
        information(machines[0]);
        machines[1].putMoneyIn(40);
        information(machines[1]);
        machines[2].putMoneyIn(200);
        information(machines[2]);
    }

    static void information (DrinkMachine drinkMachine) {
        System.out.println("You can use this machine " + drinkMachine.getAvailableCups() + " more times and made " + drinkMachine.getMoneyIn() + " Ft profit. \n");
    }
}
