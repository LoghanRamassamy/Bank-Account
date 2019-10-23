package fr.lacombe;

public class BankAccount {
    public static final double RESET_BALANCE = 0.00;
    private double balance;
    private History history = new History(new Transaction("account opening", balance, balance));

    public BankAccount(double balance) {
        this.balance = balance >= 0 ? balance : 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
        history.add(new Transaction("deposit", money, balance));
    }

    public void withdrawal(double money) {
        if(checkBlindBalance(money)) {
            history.add(new Transaction("balance blind", money, balance));
        } else {
            balance -= money;
            history.add(new Transaction("withdrawal", money, balance));
        }
    }

    public void withdrawalAll() {
        history.add(new Transaction("withdrawal", balance, RESET_BALANCE));
        balance = RESET_BALANCE;
    }

    private boolean checkBlindBalance(double money) {
        return balance < money;
    }

    public String getHistory(){
        return history.make();
    }
}
