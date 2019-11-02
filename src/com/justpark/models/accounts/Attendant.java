package com.justpark.models.accounts;

import com.justpark.models.people.Person;

public class Attendant extends Account {
    public Attendant(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
}
