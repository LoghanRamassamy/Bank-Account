package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BankAccountTest {

    // Given All
    public static final BankAccount BANK_ACCOUNT = new BankAccount(100);

    @Test
    public void add_money_to_account()
    {
        // When
        BANK_ACCOUNT.deposit(100);

        // Then
        Assertions.assertThat(BANK_ACCOUNT.getBalance()).isEqualTo(200);
    }

}