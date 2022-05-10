package com.sydevelop.TesteJava;

public class NumberToString {


    public static void getNumberAsString() {
        String numberAsString = "2028.125";
        System.out.println("NumberAsString=" + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString +=1;
        number +=1;
        System.out.println("NumberAsString=" + numberAsString);
        System.out.println("number = " + number);





    }
}
