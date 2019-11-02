package com.justpark.models;

import com.justpark.models.accounts.Account;

public class Person extends DBObject {
    private String name;
    private Address address;
    private String phoneNumber;
    private Account account;

    private Person(Builder builder) {
        setName(builder.name);
        setAddress(builder.address);
        setPhoneNumber(builder.phoneNumber);
        account = builder.account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getAccount() {
        return account;
    }

    public static final class Builder {
        private String name;
        private Address address;
        private String phoneNumber;
        private Account account;

        public Builder(String name) {
            this.name = name;
        }

        public Builder address(Address val) {
            address = val;
            return this;
        }

        public Builder phoneNumber(String val) {
            phoneNumber = val;
            return this;
        }

        public Builder account(Account val) {
            account = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
