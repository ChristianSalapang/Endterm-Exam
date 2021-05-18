package com.company;

public abstract class Account {

    int accNumber;
    double balance;

    //const
    public Account(int accNum) {
        accNumber = accNum;
        setBalance(0.0);
    }

    //set
    public void setBalance(double bal) {
        balance = bal;
    }

    //get
    public abstract int getAccountNumber();
    public abstract double getBalance();

    public abstract String getAccInfo();

}