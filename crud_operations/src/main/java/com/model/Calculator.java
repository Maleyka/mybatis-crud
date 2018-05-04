package com.model;

import java.util.List;

public class Calculator {
    private List<Ages> ages;
    private List<Client> clients;

    public List<Ages> getAges() {
        return ages;
    }

    public void setAges(List<Ages> ages) {
        this.ages = ages;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "ages=" + ages +
                ", clients=" + clients +
                '}';
    }
}
