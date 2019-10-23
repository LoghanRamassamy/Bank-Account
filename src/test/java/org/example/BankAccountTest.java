package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void add_money_without_pennies_to_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.deposit(100);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(200);
    }

    @Test
    public void add_money_with_pennies_to_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.deposit(50.50);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(150.50);
    }

    @Test
    public void withdraw_some_of_money_without_pennies_to_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.withdrawal(50);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(50);
    }

    @Test
    public void withdraw_some_of_money_with_pennies_to_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.withdrawal(50.50);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(49.50);
    }

    @Test
    public void withdraw_beyond_balance() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.withdrawal(101);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

    @Test
    public void withdraw_all_of_saving_money_to_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.withdrawalAll();

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    @Ignore("WIP : Minutes...")
    public void add_many_transaction_to_history_account() {
        // Given
        BankAccount bankAccount = new BankAccount(500);

        // When
        bankAccount.withdrawal(150.50);
        bankAccount.deposit(350.50);
        bankAccount.withdrawalAll();
        String history = bankAccount.getHistory();

        // Then
        String expected = "Transaction [withdrawal of 150.50$ on 10/23/2019 at 16h49mn. You have 349.50$ left. Transaction [deposit of 350.50$ on 10/23/2019 at 16h26mn. You have 700.00$ left. Transaction [withdrawal of 700.00$ on 10/23/2019 at 16h26mn. You have 0.00$ left.] ";
        Assertions.assertThat(history).isEqualTo(expected);
    }

}