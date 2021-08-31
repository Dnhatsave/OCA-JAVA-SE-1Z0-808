package com.sydevelop;

public class TeenChecker {

    public static boolean isTeen(int teen){
        return (teen >= 13 && teen <= 19);
    }
    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c) ;
    }
}
