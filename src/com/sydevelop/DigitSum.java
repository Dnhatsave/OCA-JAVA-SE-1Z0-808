package com.sydevelop;

public class DigitSum {
    public static int sumDigits(int number){
        int sum = 0;
        if(number >= 10){

            while (number > 0) {
                // Extract least significant digit
                int leastDigit = number % 10;
                sum += leastDigit;
                // Drop the least significant digit
                number /= 10;   // same as number = number / 10;
            }

            System.out.println("The sum of Digits is " + sum);
            return sum;
        }else{
            System.out.println("Invalid Value");
            return -1;
        }
    }
}
