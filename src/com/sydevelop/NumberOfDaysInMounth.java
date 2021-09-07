package com.sydevelop;

public class NumberOfDaysInMounth {

    public static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if(year >= 1 && year <= 9999){
            return (isDivisibleBy4 && !isDivisibleBy100) || isDivisibleBy400 ? true : false;
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int mounth , int year){
        if(mounth < 1 || mounth > 12 || year < 1 || year > 9999){
            return -1;
        }else{
            if(mounth == 2 && isLeapYear(year)){
                return 29;
            }else{
                switch (mounth){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        return 28;
                    case 4: case 6: case 9: case 11:
                        return 30;
                    default:
                        return -1;
                }
            }
        }
    }


}
