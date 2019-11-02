package com.justpark.models.parking.interfaces;

import com.justpark.models.parking.Ticket;

public interface PaymentEnabled {
    public void processTicket(Ticket ticket);
    public void processPayment();
}
