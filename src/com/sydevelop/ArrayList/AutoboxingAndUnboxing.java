package com.sydevelop.ArrayList;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            //Autoboxing
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            //Unboxing
            System.out.println(i + " -->" + integerArrayList.get(i).intValue());
        }

        //Autoboxing and Unboxing using Double values
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0;dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i< myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
