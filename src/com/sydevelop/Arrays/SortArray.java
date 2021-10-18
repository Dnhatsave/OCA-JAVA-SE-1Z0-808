package com.sydevelop.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private Scanner scanner = new Scanner(System.in);

    public void printArrays(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length -1 ; i++) {
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    public int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values .\r" );
        int[] values = new int[number];

        for (int i=0; i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
