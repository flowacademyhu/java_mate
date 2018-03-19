package com.flow.inheritance;

public class Main {
    public static void main(String[] args) {
        Cake chocolateCake = new BirthdayCake (15, "Chocolate", 27);

        Cake[] confectionStore = new Cake[4];
        confectionStore[0] = new Cake (8, "Black Forest");
        confectionStore[1] = new Cake (12, "Hungarian túró");
        confectionStore[2] = new BirthdayCake (18, "Rum", 15);
        confectionStore[3] = chocolateCake;

        for (int i = 0; i < confectionStore.length; i++) {
            confectionStore[i].info();
        }
    }
}
