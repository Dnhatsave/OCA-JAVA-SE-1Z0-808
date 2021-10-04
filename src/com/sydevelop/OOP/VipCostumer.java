package com.sydevelop.OOP;

public class VipCostumer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCostumer(){
    this("unknown name",1000000.00,"unknown email");
    }

    public VipCostumer(String name, String email){
        this(name,120000.00,email);
    }
    public VipCostumer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
