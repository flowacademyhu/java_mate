package com.flow.friday.travel.ticket;

public class Ticket {
    private int validDistance;
    private String destination;
    private boolean valid;
    private float discount;
    private static int pricePerKm = 25;

    public int getValidDistance() {
        return validDistance;
    }

    public void setValidDistance(int validDistance) {
        this.validDistance = validDistance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public static int getPricePerKm() {
        return pricePerKm;
    }

    public static void setPricePerKm(int pricePerKm) {
        Ticket.pricePerKm = pricePerKm;
    }

    public Ticket(String destination, int validDistance, int discount) {
        this.validDistance = validDistance;
        this.destination = destination;
        this.discount = discount;
        valid = true;
    }

    public int getPrice() {
        int Price = Math.round(validDistance * (pricePerKm - pricePerKm * (discount / 100)));
        return Price;
    }

    public void useTicket() {
        valid = false;
    }

    @Override
    public String toString() {
        return "[Destination: " + destination +
                "; Discount: " + (Math.round(discount)) +
                "%; Distance: " + validDistance +
                " km; Price: " + getPrice() + " Ft]";
    }
}
