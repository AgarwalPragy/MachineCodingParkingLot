package com.justpark.models.accounts;

import com.justpark.models.people.Person;

public class Customer extends Account {
    public Customer(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
}
