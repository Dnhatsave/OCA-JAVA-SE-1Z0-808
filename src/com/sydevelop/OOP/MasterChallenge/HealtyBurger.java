package com.sydevelop.OOP.MasterChallenge;

public class HealtyBurger extends Hamburger{
    private String healtyExtraName1;
    private double healtyExtraPrice1;

    private String healtyExtraName2;
    private double healtyExtraPrice2;

    public HealtyBurger( String meat, double price) {
        super("Healty", "Brown rye", meat, price);
    }

    public void addHealtyAddition1(String name, double price){
        this.healtyExtraName1 = name;
        this.healtyExtraPrice1 = price;
    }

    public void addHealtyAddition2(String name, double price){
        this.healtyExtraName2 = name;
        this.healtyExtraPrice2 = price;
    }

    @Override
    public double getItemsPrice() {
        double hamburgerPrice = super.getItemsPrice();

        if(healtyExtraName1 != null){
            System.out.println(healtyExtraName1 + " was added, cost " + healtyExtraPrice1);
            hamburgerPrice += this.healtyExtraPrice1;
        }

        if(healtyExtraName2 != null){
            System.out.println(healtyExtraName2 + " was added, cost " + healtyExtraPrice2);
            hamburgerPrice += this.healtyExtraPrice2;
        }

        return hamburgerPrice;
    }
}
