package ports.useCases;

import domain.Account;

public interface WithdrawAmountUseCase {
    public String execute(Account account, Double amount);
}
