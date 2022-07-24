package domain;

import java.util.UUID;

public class Client {

    UUID clientId;

    private String name;

    public Client(String name) {
        this.clientId = UUID.randomUUID();
        this.name = name;
    }

    public UUID getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
