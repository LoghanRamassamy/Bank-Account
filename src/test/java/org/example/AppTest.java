package org.example;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

import javax.security.auth.login.AccountException;

public class AppTest 
{

    @Test
    public void should_answer_with_true()
    {
        assertTrue( true );
    }

    @Test
    @Ignore("WIP")
    public void shouldAnswerWithTrue()
    {
        // Given
        Client loghan = new Client(new BankAccount(100));

        // When
        loghan.makeDepositOf(100);

        // Then
        Assertions.assertThat(loghan.getBalance()).isEqualTo(200);
    }

    
}
