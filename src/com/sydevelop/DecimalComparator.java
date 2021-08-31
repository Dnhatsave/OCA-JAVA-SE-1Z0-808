package com.sydevelop;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble){
        int firstValue = (int) (firstDouble * 1000);
        int secondValue = (int) (secondDouble * 1000);

        if(firstValue == secondValue){
            return true;
        }else {
            return false;
        }
    }
}
