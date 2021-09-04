package com.sydevelop;

public class SecondsMinutes {

    public static void getDurationString(int minutes, int seconds){

        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            System.out.println("Invalid value");
        }else{
            int hours = minutes / 60;
            int remainMinutes = minutes % 60;
            System.out.println(hours + "h " + remainMinutes + "m " + seconds + "s");
        }

    }

    public static void getDurationString( int seconds){
        if(seconds < 0){
            System.out.println("Invalid value");
        }else{
            int minutes = seconds / 60;
            System.out.println( seconds + " s = " + minutes + " m");
        }
    }

    }
