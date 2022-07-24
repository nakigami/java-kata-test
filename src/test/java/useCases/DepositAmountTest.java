package useCases;

import domain.Account;
import domain.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ports.useCases.DepositAmountUseCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepositAmountTest {

    DepositAmountUseCase underTest;

    @BeforeEach
    void setUp() {
        this.underTest = new DepositAmount();
    }

    @Test
    public void itShouldDepositAmountInClientAccount() {
        // Given
        Client client = new Client("user-1");
        Account account = new Account(10000.0, client);

        // When
        String result = underTest.execute(account, 40.0);

        // Then
        assertEquals("Your new balance is : 10040.0", result);
    }

}