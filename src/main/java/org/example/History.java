package org.example;

import java.util.ArrayList;
import java.util.List;

public class History {
    private Transaction transaction;
    private List<Transaction> transactions = new ArrayList<>();

    public History(Transaction transaction) {
        this.transaction = transaction;
    }

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public String make() {
        StringBuilder result = new StringBuilder();
        for (var transaction : transactions) {
            result.append(transaction.toString());
            result.append(" ");
        }
        return result.toString();
    }
}
