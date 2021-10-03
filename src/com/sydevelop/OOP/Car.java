package com.sydevelop.OOP;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private int year;
    private String engine;
    private String model;
    private String color;

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
