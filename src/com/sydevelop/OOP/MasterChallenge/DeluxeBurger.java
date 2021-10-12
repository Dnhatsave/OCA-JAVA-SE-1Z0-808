package com.sydevelop.OOP.MasterChallenge;

public class DeluxeBurger extends Hamburger{
    private final String ERROR_MESSAGE = "Cannot add aditional items to deluxe burger";
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage and Bacon", 15.0);
        super.addHamburgerAddition1("Chips",2);
        super.addHamburgerAddition2("Drink",3);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(ERROR_MESSAGE);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(ERROR_MESSAGE);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(ERROR_MESSAGE);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(ERROR_MESSAGE);
    }
}
