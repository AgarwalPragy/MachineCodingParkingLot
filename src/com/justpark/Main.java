package com.justpark;

import com.justpark.models.Address;
import com.justpark.models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello everyone!");
        Address a = new Address.Builder()
                .state("Maharashtra")
                .country("India")
                .zipCode("00000")
                .city("Pune")
                .streetAddress("Amanora Chambers, IB Office")
                .build();

        Person atul = new Person.Builder("Atul")
                .phoneNumber("sfsdf")
                .build();

        System.out.println(a.toString());
        System.out.println(atul.toString());
    }
}


