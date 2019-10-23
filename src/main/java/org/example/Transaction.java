package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Transaction {
    private String name;
    private String amount;

    public Transaction(String name, Double amount) {
        this.name = name;
        this.amount = numberFormater(amount);
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
}
