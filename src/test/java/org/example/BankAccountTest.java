package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void add_money_to_account()
    {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.deposit(100);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(200);
    }

    @Test
    public void add_money_with_pennies_to_account()
    {
        // Given
        BankAccount bankAccount = new BankAccount(100);

        // When
        bankAccount.deposit(50.50);

        // Then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(150.50);
    }

}