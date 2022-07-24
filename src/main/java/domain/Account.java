package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private Double balance;

    private Client client;

    private List<Operation> operations;

    public Account(Double balance, Client client) {
        this.balance = balance;
        this.client = client;
        this.operations = new ArrayList<>();
    }

    public boolean addOperation(Date date, String type, Double amount) {
        return operations.add(new Operation(this, amount, date, type, this.balance));
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
