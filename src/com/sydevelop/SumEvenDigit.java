package com.sydevelop;

public class SumEvenDigit {
    public static int getEvenDigitSum(int number){
        int lastDigit = 0;
        int sum = 0;
        if(number < 0){
            return -1;
        }

        while (number > 0){
            // Find last digit
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            // Extract last Digit
            number /= 10;
        }

        System.out.println("The sum of Even Digits is " + sum);
        return sum;
    }
}
