package com.sydevelop.OOP;

import java.util.Scanner;

public class BankChallenge {

    private int accountNumber;
    private double balance;
    private String costumerName;
    private String email;
    private int cellPhone;
    Scanner scanner = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void depositFound(){
        System.out.println("Enter the amount value: ");
        double amount =  scanner.nextInt();
        balance = amount + balance;

        System.out.println(amount + " Mt was added to account " + accountNumber +  " current balance is " + this.balance);

    }
    // Another solution
    public double deposit(double amount){
        return  balance += amount;
    }

    public void withDrawal(){
        System.out.println("Enter the amount to withdrawal ");
        double amount = (double) scanner.nextInt();
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " Operation successfully " + accountNumber +  " current balance is " + this.balance);

        }else{
            System.out.println("Your money is Insufficient ...");
        }
   }

   // Another solution
   public double withDrawal2(double amount){
        return balance >= amount ? balance - amount : -1;
   }


}
