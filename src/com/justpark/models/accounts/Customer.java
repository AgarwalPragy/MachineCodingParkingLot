package com.justpark.models.accounts;

import com.justpark.models.parking.Ticket;
import com.justpark.models.Person;

public class Customer extends Account {
    public Customer(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }

    public Ticket getTicket() {
        return null;
    }

    public void payForTicket(Ticket ticket) {

    }
}
