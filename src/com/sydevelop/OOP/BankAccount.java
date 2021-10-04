package com.sydevelop.OOP;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String CostumerName;
    private String email;
    private int phoneNumber;

    public  BankAccount(){
        System.out.println("Empty Constructur called");
    }
    public BankAccount(String costumerName, int accountNumber, double balance, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.CostumerName = costumerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
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
        return CostumerName;
    }

    public void setCostumerName(String costumerName) {
        CostumerName = costumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
         this.balance += depositAmount;
    }

    public void withdrawal(double amount){
        if(balance - amount < 0){
            System.out.println("Insuficiente balance");
             balance = 0;
        }else {
             balance -= amount;
        }
    }


}
