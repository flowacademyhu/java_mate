package com.flow.practice.warehouse;

import com.flow.practice.expection.Bad;
public class DairyProduct implements Good {
    private String name;
    private long dueDate;
    private long prodDate;

    public DairyProduct(String name, long dueDate, long prodDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.prodDate = prodDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

    public long getProdDate() {
        return prodDate;
    }

    public void setProdDate(long prodDate) {
        this.prodDate = prodDate;
    }

    @Override
    public boolean good() throws Bad {
        long bought = System.currentTimeMillis();
        if ((bought - prodDate) <= dueDate) {
            return true;
        }
        throw new Bad("This product has already expired.");
    }

    @Override
    public String toString() {
        try {
            if (good()) {
                return "This dairy product is called " + name + " and is still good.";
            }
        } catch (Bad e) {
            e.printStackTrace();
        }
        return "This dairy product is called " + name + " and already went bad.";
    }
}
