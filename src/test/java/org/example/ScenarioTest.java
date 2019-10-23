package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class ScenarioTest {

    @Test
    public void bank_client_make_a_deposit_in_her_account() {
        // Given
        Client loghan = new Client(new BankAccount(100));

        // When
        loghan.makeDepositOf(100);

        // Then
        Assertions.assertThat(loghan.getBalance()).isEqualTo(200);
    }

    @Test
    public void bank_client_make_a_withdrawal_from_her_account() {
        // Given
        Client karin = new Client(new BankAccount(200));

        // When
        karin.makeWithdrawalOf(100);

        // Then
        Assertions.assertThat(karin.getBalance()).isEqualTo(100);
    }

    @Test
    @Ignore("WIP : Minutes...")
    public void bank_client_can_see_the_history_of_her_account() {
        // Given
        Client justin = new Client(new BankAccount(500));

        // When
        justin.makeWithdrawalOf(150.50);
        justin.makeDepositOf(350.50);
        justin.makeWithdrawalOfRemains();

        // Then
        String expected = "Transaction [withdrawal of 150.50$ on 10/23/2019 at 16h49mn. You have 349.50$ left. Transaction [deposit of 350.50$ on 10/23/2019 at 16h30mn. You have 700.00$ left. Transaction [withdrawal of 700.00$ on 10/23/2019 at 16h30mn. You have 0.00$ left.] ";
        Assertions.assertThat(justin.getHistory()).isEqualTo(expected);
        Assertions.assertThat(justin.getBalance()).isEqualTo(0.00);
    }
}
