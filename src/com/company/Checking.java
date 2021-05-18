package com.company;

public class Checking extends Account {

    public Checking(int accNumber) {
        super(accNumber);
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccInfo() {
        return("Checking Account Information \n Account Number: " + getAccountNumber() + "\n Current Balance: " + getBalance());
    }
}
