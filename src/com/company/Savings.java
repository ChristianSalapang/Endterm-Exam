package com.company;

public class Savings extends Account {

    private double interestRate;
    public Savings(int accNumber, double interest) {
        super(accNumber);
        setInterestRate(interest);
    }

    public void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountInfo() {
        return("Savings Account Information \n Account Number: " + getAccountNumber() + "\n Current Balance: " + getBalance() + "\n Interest Rate: " + getInterestRate() + "%");
    }
}
