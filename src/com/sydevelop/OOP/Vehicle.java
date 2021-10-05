package com.sydevelop.OOP;

public class Vehicle {

    private int doors;
    private String engine;
    private int weels;
    private String gas;

    public Vehicle(){

    }

    public Vehicle(int doors, String engine, int weels, String gas) {
        this.doors = doors;
        this.engine = engine;
        this.weels = weels;
        this.gas = gas;
    }
    public void shifGear(int gear){
        System.out.println("The is set to " + gear);
    }

    public void move(int speed){
        if (speed <= 20) {
            shifGear(1);
            System.out.println("Current speed is " + speed);
        } else if(speed >= 40 && speed < 60){
            shifGear(2);
            System.out.println("Current speed is " + speed);
        }else{
            shifGear(3);
            System.out.println("Current speed is " + speed);
        }
    }

    public int getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public int getWeels() {
        return weels;
    }

    public String getGas() {
        return gas;
    }
}
