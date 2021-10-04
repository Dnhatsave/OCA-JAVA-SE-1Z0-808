package com.sydevelop;

import com.sydevelop.OOP.*;

public class Main {

    public static void main(String[] args) {
//        SpeedConverter.printConversion(1.5);
//        SpeedConverter.printConversion(10.25);
//        SpeedConverter.printConversion(-5.6);
//        SpeedConverter.printConversion(25.42);
//        SpeedConverter.printConversion(75.114);

//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

//        BarkingDog.shouldWakeUp(true,1);
//        BarkingDog.shouldWakeUp(false,2);
//        BarkingDog.shouldWakeUp(true,8);
//        BarkingDog.shouldWakeUp(true,-1);

//        double myResult = MethodOverloading.calcFeetAndInchesToCentimenters(16,0);
//
//        System.out.println(16 + " Ft = " + myResult + " Cm");
//
//        double mySecondResult = MethodOverloading.calcFeetAndInchesToCentimenters(myResult);
//
//        System.out.println(myResult + " Cm = " + mySecondResult + " Ft");

//        SecondsMinutes.getDurationString(65,0);
//        SecondsMinutes.getDurationString(3600);

//        System.out.println(AreaCalculator.area(5.0));
//        System.out.println(AreaCalculator.area(-1));
//        System.out.println(AreaCalculator.area(5.0, 4.0));
//        System.out.println(AreaCalculator.area(-1.0, 4.0));

//        MinutesToYear.printYearsAndDays(525600);
//        MinutesToYear.printYearsAndDays(1051200);
//        MinutesToYear.printYearsAndDays(561600);

//          EqualityPrinter.printEqual(1, 1, 1);
//          EqualityPrinter.printEqual(1, 1, 2);
//          EqualityPrinter.printEqual(-1, -1, -1);
//          EqualityPrinter.printEqual(1, 2, 3);

//        PlayingCat.isCatPlaying(true,10);
//        PlayingCat.isCatPlaying(false,36);
//        PlayingCat.isCatPlaying(false,35);


//        char letter = 'F';
//
//        switch (letter){
//            case 'A':
//                System.out.println(showMessage(letter));
//                break;
//            case 'B':
//                System.out.println(showMessage(letter));
//                break;
//            case 'C': case 'D': case 'E':
//                System.out.println(showMessage(letter));
//                break;
//            default:
//                System.out.println("Letter not found try again!");
//        }


//        DayOfTheWeek.printDayOfTheWeek(7);
//        DayOfTheWeek.printDayOfTheWeek2(7);

//        NumberInWord.printNumberInWord(-1);
//        NumberInWord.printNumberInWord(0);
//        NumberInWord.printNumberInWord(1);
//        NumberInWord.printNumberInWord(2);
//        NumberInWord.printNumberInWord(3);
//        NumberInWord.printNumberInWord(4);
//        NumberInWord.printNumberInWord(5);
//        NumberInWord.printNumberInWord(6);
//        NumberInWord.printNumberInWord(7);
//        NumberInWord.printNumberInWord(8);
//        NumberInWord.printNumberInWord(9);
//        NumberInWord.printNumberInWord(10);

//          PrimeNumber.printPrimeNumbers(10);

//        Sum5and3.printSum5and3();
//        SumOdd.sumOdd(100,100);

//        DigitSum.sumDigits(2221);
//        Palindrome.isPalindrome(2022);
//        FirstAndLastDigitSum.sumFirstAndLastDigit(50);
//        SumEvenDigit.getEvenDigitSum(208171);
//        GreatestCommonDivisor.getGreatestCommonDivisor(12,30);
//        AllFactors.printFactors(6);


        //OOP CHAPTER
//        Car car = new Car();
//        car.setModel("Wrangler");
//        System.out.println("The car mode is " + car.getNodel());
//        car.setModel("Sahara2");
//        System.out.println("The car mode is changed to " + car.getNodel());


        // OOP First Exercise
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        // OOP Sencond Challenge Person
//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

        // OOP Bank Challenge
//        BankAccount dercioBCI = new BankAccount("Dercio Inacio Nhatsave",12312312,25000,"dercionhatsave@ruca.co.mz",876532342);
//
//        System.out.println("Your account balance is " + dercioBCI.getBalance());
//        System.out.println("Account info: ");
//        System.out.println("Account Number " + dercioBCI.getAccountNumber() + ", Name " + dercioBCI.getCostumerName());
//        System.out.println("E-mail: " + dercioBCI.getEmail() + ", Phone Number: " + dercioBCI.getPhoneNumber());
//
//        dercioBCI.deposit(5000);
//        System.out.println("Your account balance is " + dercioBCI.getBalance());


        // OOP VIP Costumer challenge
//        VipCostumer vip = new VipCostumer();
//        System.out.println( "Name " + vip.getName() + " Credit " + vip.getCreditLimit() + " email " + vip.getEmail()) ;
//
//        VipCostumer vip2 = new VipCostumer("Dercio","dercio dercio @gmail.com");
//        System.out.println( "Name " + vip2.getName() + " Credit " + vip2.getCreditLimit() + " email " + vip2.getEmail()) ;

        // Inharitance methods
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Nick",8,20,2,4,1,20,"long silk");
        dog.eat();
        dog.run();

    }
//    public static String showMessage(char letter){
//        return  "Letter " + letter +  " was found";
//    }

}
