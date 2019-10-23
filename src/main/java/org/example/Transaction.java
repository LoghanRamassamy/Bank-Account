package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Transaction {
    private final String date;
    private String name;
    private String amount;
    private final String balance;

    public Transaction(String date, String name, Double amount, Double balance) {
        this.date = date;
        this.name = name;
        this.amount = numberFormater(amount);
        this.balance = numberFormater(balance);
    }

    public String getDate() {
        return date;
    }

    public String getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    private String numberFormater(double number) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("€");
        dfs.setGroupingSeparator(' ');
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);

        df.setDecimalFormatSymbols(dfs);

        return df.format(number);
    }

    @Override
    public String toString() {
        return "Transaction [" +
                "date='" + date + '\'' +
                ", operation='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", balance='" + balance + '\'' +
                ']';
    }
}
