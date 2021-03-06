package com.sydevelop;

import com.sydevelop.ArrayList.Bank;
import com.sydevelop.ArrayList.Contacts;
import com.sydevelop.ArrayList.GroceryList;
import com.sydevelop.ArrayList.MobilePhone;
import com.sydevelop.Arrays.AvarageArray;
import com.sydevelop.Arrays.MinimunElementChallenge;
import com.sydevelop.Arrays.ReverseArray;
import com.sydevelop.Arrays.SortArray;
import com.sydevelop.Interfaces.DeskPhone;
import com.sydevelop.Interfaces.ITelephone;
import com.sydevelop.LinkedList.Costumer;
import com.sydevelop.LinkedList.Demo;
import com.sydevelop.OOP.BankChallenge;
import com.sydevelop.OOP.Encapsulation.Printer;
import com.sydevelop.OOP.MasterChallenge.DeluxeBurger;
import com.sydevelop.OOP.MasterChallenge.Hamburger;
import com.sydevelop.OOP.MasterChallenge.HealtyBurger;
import com.sydevelop.OOP.Polymorphism.CarPoly;
import com.sydevelop.OOP.Polymorphism.Ford;
import com.sydevelop.OOP.Polymorphism.Holden;
import com.sydevelop.OOP.Polymorphism.Mitsubishi;
import com.sydevelop.OOP.Traings;
import com.sydevelop.TesteJava.NumberToString;
import com.sydevelop.TesteJava.PasTras;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static MobilePhone mobilePhone = new MobilePhone();

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
//        Animal animal = new Animal("Animal",1,1,5,5);
//        Dog dog = new Dog("Nick",8,20,2,4,1,20,"long silk");
//        dog.eat();
//        dog.run();

        // Car inheritance

//        Car jeep = new Car(2,"V8 bi Turbo",4,"Diesel","Wrangler","black");
//        System.out.println(jeep.getNodel() +  " with " + jeep.getEngine() );
//        jeep.move(45);
//        jeep.shifGear(4);

        // Circle and Cilynder exercise
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

        // Rectangle and Cuboid Exercise

//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(5,10,5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());

        // Printer Encpasualation  challenge
//        Printer printer = new Printer(5,25,false);
//        printer.printPage(10);
//
//        printer.printPage(1);
//        printer.fillUpTonner(50);
//        printer.printPage(5);

        // Polymorphism
//
//        CarPoly car = new CarPoly(8,"Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//        System.out.println( "Cilynders " + car.getCylinders());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRK 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
//        System.out.println( "Cilynders " + holden.getCylinders());


        //Master Challenge Burger

//        Hamburger hamburger = new Hamburger("Basic", "White","Sausage",5);
//        double price = hamburger.getItemsPrice();
//        hamburger.addHamburgerAddition1("Tomato", 1);
//        hamburger.addHamburgerAddition2("lettuce",2.0);
//        System.out.println(" Total price is " + hamburger.getItemsPrice());
//
//        HealtyBurger healtyBurger = new HealtyBurger("Becaon",2);
//        healtyBurger.addHamburgerAddition1("Egg",4);
//        healtyBurger.addHealtyAddition1("Sauce",1);
//        healtyBurger.addHealtyAddition2("Lettis",3);
//        System.out.println(" Total price is " + healtyBurger.getItemsPrice());
//
//        DeluxeBurger db = new DeluxeBurger();
//        db.getItemsPrice();
//        db.addHamburgerAddition3("Buggs Bunny", 40);
//        System.out.println(" Total price is " + db.getItemsPrice());


        // Arrays
//        AvarageArray arrays = new AvarageArray();
//        arrays.printArr();

        // Sorted Arrays Challenge
//
//        SortArray array = new SortArray();
//        int[] myIntArray = array.getIntegers(5);
//        int[] sort = array.sortIntegers(myIntArray);
//        array.printArrays(sort);

        // Minimun array
//
//        MinimunElementChallenge minArray = new MinimunElementChallenge();
//        System.out.println("Enter Count:");
//        int count = minArray.scanner.nextInt();
//        int[] returnedArray = minArray.readIntegers(count);
//        int returnedMin = minArray.findMin(returnedArray);
//        System.out.println("The minimun value of array is " + returnedMin);

//        // Reverse Array Challenge
//        int[] array = {1,5,3,7,11,9,15};
//
//        System.out.println("Array = " + Arrays.toString(array));
//
//        ReverseArray reverseArray = new ReverseArray();
//        reverseArray.reverse(array);
//        System.out.println("Reversed Array = " + Arrays.toString(array));

        // Array List

//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//
//        while (!quit){
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice){
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    groceryList.printList();
//                    break;
//                case 2:
//                    add();
//                    break;
//                case 3:
//                    updateItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchItem();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//            }
//        }

        // Linked List
//        Costumer costumer = new Costumer("Tim",54.96);
//        Costumer anotherCostumer = costumer;
//        anotherCostumer.setBalance(12.18);
//        System.out.println("Balance for costumer " + costumer.getName() +  " is " + costumer.getBalance());
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//
//        intList.add(1);
//        intList.add(3);
//        intList.add(4);
//
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(i + ": " + intList.get(i));
//        }
//
//        intList.add(1,2);
//
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(i + ": " + intList.get(i));
//        }

//        Demo demo = new Demo();
//        demo.addList();

        // Interface

//        ITelephone derciosPhone;
//        derciosPhone = new DeskPhone(846896843);
//        derciosPhone.powerOn();
//        derciosPhone.callPhone(846896843);
//        derciosPhone.answer();
//
//        derciosPhone = new MobilePhone(826896843);
//        derciosPhone.powerOn();
//        derciosPhone.callPhone(826896843);
//        derciosPhone.answer();

        // pastras

//        PasTras pasTras = new PasTras();
//        pasTras.calculateFactorial();

//        NumbersToWord.numberToWord(3450);
//        NumberToString.getNumberAsString();

//        MinAndMaxInputChallenge.MinAndMaxInput();
//
//        BankChallenge bank = new BankChallenge();
//        bank.setCostumerName("Dercio Nhatsave");
//        bank.setAccountNumber(12312344);
//        bank.setCellPhone(846786843);
//        bank.setEmail("dercionhatsave@gmail.com");
//        bank.setBalance(290.00);
//
//        System.out.println("Dear client " + bank.getCostumerName() + " you have " +
//                bank.getBalance() + " MT " + " at your account number " + bank.getAccountNumber());
//
//        //bank.depositFound();
//        double amount = bank.withDrawal2(293);
//        System.out.println(" Operation successfully " + bank.getAccountNumber() +  " current balance is " + amount);


////
//
//        boolean quit = false;
//        printInstructions();
//        while (!quit) {
//            System.out.println("Enter your choice: (0 to show available options) ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice){
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    mobilePhone.printList();
//                    break;
//                case 2:
//                    add();
//                    break;
//                case 3:
//                    updateItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchItem();
//                    break;
//                case 6:
//                    System.out.println("Bye Bye :) ...");
//                    quit = true;
//                    break;
//            }
//        }


        // bank AutoBoxing and Uboxing Challenge

        Bank bank = new Bank("BCI");
        bank.addNewBrach("Av. 24 julho");

        bank.addCostumer("Av. 24 julho", "Dercio Nhatsave", 20000000.0);
        bank.addCostumer("Av. 24 julho", "Cleyda Nhatsave", 3999003240.0);
        bank.addCostumer("Av. 24 julho", "Juliao Jubileu", 34556);

        bank.addNewBrach("Sofala");
        bank.addCostumer("Sofala", "Sofia Agostinho", 556);

        bank.addCostumerTransaction("Av. 24 julho", "Dercio Nhatsave", 5000.0);
        bank.addCostumerTransaction("Av. 24 julho", "Dercio Nhatsave", 900.0);
        bank.addCostumerTransaction("Av. 24 julho", "Juliao Jubileu", 15000.0);

        bank.listCostumers("Av. 24 julho", true);


    }

    public static int[] getArray(int values){
        System.out.println("Enter Integer number: \n");
        int[] array = new int[values];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is "+ array[i] );
        }
    }

    public static double getAvarange(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static int[] sortArray(int[] oldArray){
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        // Descending order

        for (int i = oldArray.length; i >= 0; i--) {
            oldArray[i] = newArray[i];
        }
        return newArray;
    }

    // ArrayList Sub Methods
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an contact to the list.");
        System.out.println("\t 3 - To modify an contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To search for an contact name in the list.");
        System.out.println("\t 6 - To quit the application.");

    }
    public static void add(){
        System.out.println("Please enter the contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the contact number: ");
        String contact = scanner.nextLine();
        Contacts contacts = Contacts.createContact(name,contact);
        if(mobilePhone.add(contacts)){
            System.out.println("Contact sucessfully created");
        } else{
            System.out.println("Error while creating contact created");
        }
    }

    public static void updateItem(){
        System.out.println("Enter existing Contact name: ");
        String contactName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(contactName);

        if (existingContactRecord == null){
            System.out.println("Contact not found...");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();

        System.out.println("Enter new Contact number");
        String newNumber = scanner.nextLine();

//        Contacts existingNewContactRecord = mobilePhone.queryContact(newName);
//
//        if ()
       Contacts newContact = Contacts.createContact(newName,newNumber);

        if (mobilePhone.update(existingContactRecord,newContact)) {
            System.out.println("Successfully updated Record");
        }else{
            System.out.println("Error while update the record");
        }

    }


    public static void removeItem(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        mobilePhone.remove(existingContactRecord);
    }

    public static void searchItem(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " \n "
            + "Phone Number: " + existingContactRecord.getPhoneNumber());
    }
//    public static String showMessage(char letter){
//        return  "Letter " + letter +  " was found";
//    }

}
