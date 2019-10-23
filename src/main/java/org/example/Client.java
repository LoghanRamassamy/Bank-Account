package org.example;

public class Client {
    private BankAccount bankAccount;

    public Client(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void makeDepositOf(double money) {
        bankAccount.deposit(money);
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }

    public void makeWithdrawalOf(double money) {
        bankAccount.withdrawal(money);
    }

    public String getHistory() {
        return bankAccount.makeHistory();
    }

    public void makeWithdrawalOfRemains() {
        bankAccount.withdrawalAll();
    }
}
