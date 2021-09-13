package com.sydevelop;

public class Sum5and3 {
    public static void printSum5and3(){
        int sum = 0;
        int count = 0;
        for (int i=1; i<=1000;i++ ){
            if((i%3 == 0) && (i%5 == 0)){
                count ++;
                sum+= i;
                System.out.println("Number " + i + " is divided by 3 and 5 ");

                if(count == 5) break;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
