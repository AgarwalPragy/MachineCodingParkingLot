package com.justpark;

import com.justpark.models.Address;

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

    }
}


