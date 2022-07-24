package useCases;

import domain.Account;
import ports.useCases.DepositAmountUseCase;
import utils.StatementPrinter;

import java.util.Date;

public class DepositAmount implements DepositAmountUseCase {
    @Override
    public String execute(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);

        account.addOperation(new Date(), "Deposit", amount);

        return StatementPrinter.print("Your new balance is : " + account.getBalance().toString());
    }
}
