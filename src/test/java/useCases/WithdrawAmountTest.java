package useCases;

import domain.Account;
import domain.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ports.useCases.WithdrawAmountUseCase;

import static org.junit.jupiter.api.Assertions.*;

class WithdrawAmountTest {
    WithdrawAmountUseCase underTest;

    @BeforeEach
    void setUp() {
        this.underTest = new WithdrawAmount();
    }

    @Test
    public void itShouldWithdrawAmountFromClientAccount() {
        // Given
        Client client = new Client("user-1");
        Account account = new Account(10000.0, client);

        // When
        String result = underTest.execute(account, 40.0);

        // Then
        assertEquals("Your new balance is : 9960.0", result);
        assertEquals(account.getBalance(), 9960.0);
    }

    @Test
    public void itShouldNotWithdrawAmountFromClientAccount() {
        // Given
        Client client = new Client("user-1");
        Account account = new Account(100.0, client);

        // When
        String result = underTest.execute(account, 400.0);

        // Then
        assertEquals("You don't have enough balance in your account.", result);
        assertEquals(account.getBalance(), 100.0);
    }
}