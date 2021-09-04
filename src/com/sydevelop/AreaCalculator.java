package com.sydevelop;

public class AreaCalculator {
    private static final double NEGATIVE_VALUE = -1.0;
    public static double area(double radius){
        if(radius < 0){
            return NEGATIVE_VALUE;
        }else{
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return NEGATIVE_VALUE;
        }else{
            return x * y;
        }
    }
//    TERNARY SOLUTION
//    public static double area (double radius) {
//        return (radius < 0) ? -1 : radius * radius * Math.PI;
//    }
//
//    public static double area (double x, double y) {
//        return (x < 0 || y < 0) ? -1 : x * y;
//    }


}
