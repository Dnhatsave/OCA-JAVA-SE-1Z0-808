package com.sydevelop;

public class EqualityPrinter {

    private static final String INVALID_VALUE = "Invalid Value";
    private static final String ALL_NUMBERS_EQUAL = "All numbers are equal";
    private static final String ALL_NUMBERS_DIFERENT = "All numbers are different";
    private static final String NEITHER_ARE_EQUAL_DIFERENT = "Neither all are equal or different";

    public static void printEqual(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println(INVALID_VALUE);
        }else if(a == b && b == c){
            System.out.println(ALL_NUMBERS_EQUAL);
        }else if(a != b && a != c && b != c){
            System.out.println(ALL_NUMBERS_DIFERENT);
        }else {
            System.out.println(NEITHER_ARE_EQUAL_DIFERENT);
        }
    }
}
