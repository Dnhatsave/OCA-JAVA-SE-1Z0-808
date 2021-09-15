package com.sydevelop;

public class Palindrome {
    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;

        while (number > 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if(num != reverse){
            System.out.println("Is false");
            return false;
        }else{
            System.out.println("is palindrome");
            return false;
        }
    }
}
