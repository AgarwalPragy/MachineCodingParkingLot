package com.justpark.models.people;

import com.justpark.models.DBObject;
import com.justpark.models.accounts.Account;

public class Person extends DBObject {
    private String name;
    private String address;
    private String phoneNumber;
    private final Account account;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }
}
