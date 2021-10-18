package com.sydevelop.Arrays;

import java.util.Scanner;

public class AvarageArray {

    private Scanner scanner = new Scanner(System.in);
    int[] myInteger = getIntegers(5);

    public void printArr(){
        for (int i=0;i<myInteger.length;i++){
            System.out.println("Element " + i + " Value typed was " + myInteger[i]);
        }

        System.out.println("The avarage is " + getAvarage(myInteger) );
    }

    public int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values .\r" );
        int[] values = new int[number];

        for (int i=0; i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public double getAvarage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
