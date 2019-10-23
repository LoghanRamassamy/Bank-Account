package org.example;

import org.assertj.core.api.Assertions;
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
    public void withdraw_all_of_saving_money_to_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.withdrawalAll();

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void add_many_deposit_to_history_account() {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.deposit(100);
        bankAccount.deposit(150.50);
        String history = bankAccount.makeHistory();

        // Then
        Assertions.assertThat(history).isEqualTo("deposit : 100.00 deposit : 150.50 ");
    }

    @Test
    public void add_many_withdraw_to_history_account() {
        // Given
        BankAccount bankAccount = new BankAccount(500);

        // When
        bankAccount.withdrawal(150.50);
        bankAccount.withdrawal(250.50);
        String history = bankAccount.makeHistory();

        // Then
        Assertions.assertThat(history).isEqualTo("withdrawal : 150.50 withdrawal : 250.50 ");
    }

}