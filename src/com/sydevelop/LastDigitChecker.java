package com.sydevelop;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            int lastDigitX = x % 10;
            int lastDigitY = y % 10;
            int lastDigitZ = z % 10;

            return lastDigitX == lastDigitY || lastDigitX == lastDigitZ || lastDigitY == lastDigitZ;
        }else{
            return false;
        }
    }

    public static boolean isValid(int number){
            return number >= 10 && number <= 1000;
    }
}

