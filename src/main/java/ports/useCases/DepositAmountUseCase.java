package ports.useCases;

import domain.Account;

public interface DepositAmountUseCase {
    public String execute(Account account, Double amount);
}
