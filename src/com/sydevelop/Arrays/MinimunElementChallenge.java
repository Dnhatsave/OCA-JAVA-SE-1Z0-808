package com.sydevelop.Arrays;

import java.util.Scanner;

public class MinimunElementChallenge {
    public Scanner scanner = new Scanner(System.in);


    public int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " integer values \n");
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min){
                min = value;
            }
        }
        return min;
    }

}
