package com.sydevelop.OOP.MasterChallenge;


public class Hamburger {
    private String roolType;
    private String name;
    private String meat;
    private double price;

    private String addItemName1;
    private double addItemPrice1;

    private String addItemName2;
    private double addItemPrice2;

    private String addItemName3;
    private double addItemPrice3;

    private String addItemName4;
    private double addItemPrice4;


    public Hamburger(String name, String roolType, String meat, double price){
        this.name = name;
        this.roolType = roolType;
        this.meat = meat;
        this.price = price < 0 ? 0 : price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addItemName1 = name;
        this.addItemPrice1 = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addItemName2 = name;
        this.addItemPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addItemName3 = name;
        this.addItemPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addItemName4 = name;
        this.addItemPrice4 = price;
    }

    public double getItemsPrice(){
        double total = this.price;
        System.out.println( name + " hamburger " + " with meat " + this.meat + " and " + roolType + " Roll " + "\n" +
                " cost " + this.price + " USD");
        if(addItemName1 != null){
            System.out.println(addItemName1 + " was added, cost " + addItemPrice1);
            total += this.addItemPrice1;
        }
        if(addItemName2 != null){
            System.out.println(addItemName2 + " was added, cost " + addItemPrice2);
            total += this.addItemPrice2;
        }
        if(addItemName3 != null){
            System.out.println(addItemName3 + " was added, cost " + addItemPrice3);
            total += this.addItemPrice3;
        }
        if(addItemName4 != null){
            System.out.println(addItemName4 + " was added, cost " + addItemPrice4);
            total += this.addItemPrice4;
        }

        return total;

    }

}
