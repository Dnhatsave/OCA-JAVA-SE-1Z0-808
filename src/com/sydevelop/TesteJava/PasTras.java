package com.sydevelop.TesteJava;

import java.util.Scanner;

public class PasTras {
    public Scanner scanner = new Scanner(System.in);

    public void calculateFactorial(){
        int factorial = 1;
        System.out.println("Informe um numero: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if((i%3 == 0)) System.out.println("Pas");
            if((i%5 == 0)) System.out.println("Pastras");
            factorial *= i;
        }

        System.out.println("O factorial de: "  + number + " é "+ factorial);
    }
}
