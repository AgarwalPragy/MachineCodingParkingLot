package com.justpark.models.electronics;

import com.justpark.models.parking.Ticket;
import com.justpark.models.parking.interfaces.PaymentEnabled;

public class CustomerInfoPortal extends Electronics implements PaymentEnabled {
    @Override
    public void processTicket(Ticket ticket) {

    }
}
