package com.justpark.models.accounts;

import com.justpark.models.DBObject;
import com.justpark.models.Person;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSaltedPasswordHash() {
        return saltedPasswordHash;
    }

    public void setSaltedPasswordHash(String saltedPasswordHash) {
        this.saltedPasswordHash = saltedPasswordHash;
    }

    public Person getPerson() {
        return person;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
};
