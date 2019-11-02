package com.justpark.models.accounts;

import com.justpark.models.DBObject;
import com.justpark.models.people.Person;

public abstract class Account extends DBObject {
    private String username;
    private String saltedPasswordHash;
    private final Person person;
    private AccountStatus status;

    public Account(String username, String saltedPasswordHash, Person person) {
        this.username = username;
        this.saltedPasswordHash = saltedPasswordHash;
        this.person = person;
        this.status = AccountStatus.ACTIVE;
    }
}
