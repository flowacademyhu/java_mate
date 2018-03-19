package com.flow.friday.travel.ticket;

public class ReturnTicket extends Ticket{
    private int timesUsed;

    public int getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(int timesUsed) {
        this.timesUsed = timesUsed;
    }

    public ReturnTicket(String destination, int validDistance, int discount) {
        super(destination, validDistance, discount);
        timesUsed = 0;
    }

    @Override
    public void useTicket() {
        if (timesUsed == 2) {
            setValid(false);
        }
    }

    @Override
    public int getPrice() {
        return super.getPrice() * 2;
    }

    @Override
    public String toString() {
        return "[Destination: " + getDestination() +
                "; Discount: " + Math.round(getDiscount()) +
                "%; Distance: " + getValidDistance() +
                " km; Type: Return; Price: " + getPrice() + " Ft]";
    }
}
