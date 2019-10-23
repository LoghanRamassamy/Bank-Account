package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class ScenarioTest
{
    @Test
    public void bank_client_make_a_deposit_in_her_account()
    {
        // Given
        Client loghan = new Client(new BankAccount(100));

        // When
        loghan.makeDepositOf(100);

        // Then
        Assertions.assertThat(loghan.getBalance()).isEqualTo(200);
    }

    @Test
    @Ignore("WIP")
    public void bank_client_make_a_withdrawal_from_her_account()
    {
        // Given
        Client karin = new Client(new BankAccount(200));

        // When
        karin.makeWithdrawalOf(100);

        // Then
        Assertions.assertThat(karin.getBalance()).isEqualTo(100);
    }

    
}
