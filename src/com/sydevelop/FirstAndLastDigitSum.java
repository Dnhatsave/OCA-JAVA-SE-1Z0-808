package com.sydevelop;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int sum = 0;
        int lastDigit = number % 10;
        if(number < 0){
            return -1;
        }
        while (number>0){
            number /= 10;
            if(number < 10) {
                firstDigit = number;
                break;
            }
        }
        sum = firstDigit + lastDigit;
        System.out.println("First Digit is" + firstDigit + " Last Digit is " + lastDigit + " Sum is " + sum );
        //System.out.println( "The sum is " + sum);
        return sum;
    }
}
