package domain;

import domain.Account;

import java.util.Date;

public class Operation {
    private Account account;

    private Double amount;

    private Date date;

    private String type;

    private Double balance;

    public Operation(Account account, Double amount, Date date, String type, Double balance) {
        this.account = account;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "domain.Operation{" +
                "account=" + account.getClient().getName() +
                ", amount=" + amount +
                ", date=" + date +
                ", balance=" + this.balance +
                ", type='" + type + '\'' +
                '}';
    }
}
