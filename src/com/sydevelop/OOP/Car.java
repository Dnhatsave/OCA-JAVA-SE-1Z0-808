package com.sydevelop.OOP;

import java.util.Locale;

public class Car  extends Vehicle{
    private String model;
    private String color;

    public Car(int doors, String engine, int weels, String gas, String model, String color) {
        super(doors, engine, weels, gas);
        this.model = model;
        this.color = color;
    }

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("wrangler") || validModel.equals("sahara")){
            this.model = model;
        }else{
            this.model = "Unkwon";
        }

    }

    public String getNodel(){
        return this.model;
    }
}
