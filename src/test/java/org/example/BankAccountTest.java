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
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(200);
    }

}