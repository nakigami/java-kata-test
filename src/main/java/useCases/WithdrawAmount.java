package useCases;

import domain.Account;
import ports.useCases.WithdrawAmountUseCase;
import utils.StatementPrinter;

import java.util.Date;

public class WithdrawAmount implements WithdrawAmountUseCase {
    @Override
    public String execute(Account account, Double amount) {
        if (amount > account.getBalance()) {
            return StatementPrinter.print("You don't have enough balance in your account.");
        }

        account.setBalance(account.getBalance() - amount);

        account.addOperation(new Date(), "Withdraw", amount);

        return StatementPrinter.print("Your new balance is : " + account.getBalance().toString());
    }
}
