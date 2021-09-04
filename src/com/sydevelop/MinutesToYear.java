package com.sydevelop;

public class MinutesToYear {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            double days,hours;
             hours = minutes / 60;
             days =  hours / 24;
             int remaingDays = (int) days % 365;
             int years = (int) days / 365;

            System.out.println(minutes + " min = " + years + " y and " + remaingDays + " d" );
        }
    }
}
