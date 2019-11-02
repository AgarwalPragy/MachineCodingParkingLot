package com.justpark.models.electronics;

import com.justpark.models.parking.interfaces.HasDisplay;

public class DisplayBoard extends Electronics implements HasDisplay {

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
