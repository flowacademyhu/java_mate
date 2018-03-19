package com.flow.inheritance;

public class BirthdayCake extends Cake {
    private int candleNumber;

    public BirthdayCake (int slice, String flavour, int candleNumber) {
        super(slice, flavour);
        this.candleNumber = candleNumber;
    }

    public void grantingWishes () {
        System.out.println("Granting your wish!");
    }

    public void info() {
        System.out.println("This birthday cake is " + super.getFlavour() + " flavoured, has " + this.slice + " slices and " + this.candleNumber + " candles.");
    }

}
