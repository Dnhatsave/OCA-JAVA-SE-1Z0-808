package com.sydevelop;

public class MethodOverloading {

    public static double calcFeetAndInchesToCentimenters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 13)){
            System.out.println("Invalid Parameters");
            return -1;
        }else{
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimenters(double inches){
        if(inches < 0 ){
            System.out.println("Invalid Parameters");
            return -1;
        }else{
            return inches * 0.032808;
        }
    }
}
