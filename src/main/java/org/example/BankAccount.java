package org.example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        transactions.add(new Transaction("deposit", money));
        balance += money;
    }

    public void withdrawal(double money) {
        balance -= money;
    }

    public void withdrawalAll() {
        balance = 0;
    }

    public String makeHistory() {
        StringBuilder result = new StringBuilder();
        for (var transaction : transactions) {
            result.append(transaction.getName());
            result.append(" : ");
            result.append(transaction.getAmount());
        }
        return result.toString();
    }
}
