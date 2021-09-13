package com.sydevelop;

public class PrimeNumber {

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i=2; i<= n/2; i++){
            if(n % i == 0){

                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int range){
        int count = 0;
        for (int i=2; i<= range; i++){
            if(isPrime(i)){
                count ++;
                System.out.println( "Numbber " + i + " is Prime number");
                if(count ==10) break;
            }
        }
        System.out.println("____________________________");
        System.out.println("Total found = " + count);


    }
}
