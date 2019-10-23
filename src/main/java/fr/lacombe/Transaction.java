package fr.lacombe;

import java.time.LocalDateTime;

public class Transaction {
    private String date;
    private String name;
    private String amount;
    private String balance;

    public Transaction(String name, Double amount, Double balance) {
        this.date = new DateFormatter(LocalDateTime.now()).format();
        this.name = name;
        this.amount = new NumberFormatter(amount).format();
        this.balance = new NumberFormatter(balance).format();
    }

    @Override
    public String toString() {
        return "Transaction [" + name + " of " + amount + "$ on " + date + ". You have " + balance + "$ left.]";
    }
}
