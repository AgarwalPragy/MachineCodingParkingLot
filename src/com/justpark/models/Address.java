package com.justpark.models;

public class Address {
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String streetAddress;

    private Address(Builder builder) {
        country = builder.country;
        state = builder.state;
        city = builder.city;
        zipCode = builder.zipCode;
        streetAddress = builder.streetAddress;
    }

    public static final class Builder {
        private String country;
        private String state;
        private String city;
        private String zipCode;
        private String streetAddress;

        public Builder() {
        }

        public Builder country(String val) {
            country = val;
            return this;
        }

        public Builder state(String val) {
            state = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder zipCode(String val) {
            zipCode = val;
            return this;
        }

        public Builder streetAddress(String val) {
            streetAddress = val;
            return this;
        }

        public Address build() {
            if(this.country == null)
                country = "India";
            return new Address(this);
        }
    }
}