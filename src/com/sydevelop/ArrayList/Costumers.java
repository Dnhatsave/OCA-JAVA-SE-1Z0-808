package com.sydevelop.ArrayList;

import java.util.ArrayList;

public class Costumers {
    private ArrayList<Double> transations;
    private String name;

    public Costumers(String name, Double initialAmount) {
        this.name = name;
        this.transations = new ArrayList<Double>();
        addTransation(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransations() {
        return transations;
    }

    public void addTransation(double amount) {
        this.transations.add(amount);
    }
}
