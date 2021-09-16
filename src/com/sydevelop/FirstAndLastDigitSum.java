package com.sydevelop;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        if(number < 0){
            return -1;
        }
        while (number>9){
            number /= 10;
        }
        return number + lastDigit;
    }
}
