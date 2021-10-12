package com.sydevelop.OOP.Polymorphism;

public class CarPoly {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarPoly(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }

    public String getName(){
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
