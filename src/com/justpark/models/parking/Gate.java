package com.justpark.models.parking;

import com.justpark.models.AutoExitPanel;
import com.justpark.models.DBObject;
import com.justpark.models.accounts.Attendant;
import com.justpark.models.parking.interfaces.PaymentEnabled;

public class Gate extends DBObject implements PaymentEnabled {
    private GateType type;
    private String gateName;
    private Attendant attendant;
    private AutoExitPanel exitPanel;

    void open() {

    }

    void close() {

    }

    void getTicket() {

    }

    @Override
    public void processTicket(Ticket ticket) {

    }
}
