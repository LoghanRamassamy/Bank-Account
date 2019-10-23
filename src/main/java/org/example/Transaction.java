package org.example;

public class Transaction {
    private String name;
    private Double amount;

    public Transaction(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }
}
