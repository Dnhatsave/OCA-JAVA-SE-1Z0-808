package com.sydevelop;

import java.util.Scanner;

public class ReadInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int count = 1;
            int numbers = 0;
            while (count < 10){
                System.out.println("Enter Number " + count);
                numbers += scanner.nextInt();
                count ++;
            }
            System.out.println("The sum is " + numbers);
            scanner.close();


        }else{
            System.out.println("Invalid Number");
        }

//        System.out.println("Enter your name");
//        String name = scanner.nextLine();
//        System.out.println("Enter your year of birth");
//        int yearOfBirth = scanner.nextInt();
//        int age = 2022 - yearOfBirth;
//
//        System.out.println("Your name is " + name + ", and you are "+ age + " years old") ;
//        scanner.close();
    }

}
