package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        setBalance(balance + money);
    }

    public void withdrawal(double money) {
        setBalance(balance - money);
    }

    public void withdrawalAll() {
        setBalance(0);
    }

    public String makeHistory() {
        return "";
    }
}
