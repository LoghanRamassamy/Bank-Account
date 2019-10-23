package org.example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public static final double RESET_BALANCE = 0.00;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
        transactions.add(new Transaction("10/11/2019","deposit", money, balance));
    }

    public void withdrawal(double money) {
        balance -= money;
        transactions.add(new Transaction("10/10/2019", "withdrawal", money, balance));
    }

    public void withdrawalAll() {
        transactions.add(new Transaction("11/10/2019","withdrawal", balance, RESET_BALANCE));
        balance = RESET_BALANCE;
    }

    public String makeHistory() {
        StringBuilder result = new StringBuilder();
        for (var transaction : transactions) {
            result.append(transaction.toString());
            result.append(" ");
        }
        return result.toString();
    }
}
