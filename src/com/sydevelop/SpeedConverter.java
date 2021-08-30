package com.sydevelop;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour >= 0){
            System.out.println( kilometersPerHour + " km/h = " + miles + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }

}
