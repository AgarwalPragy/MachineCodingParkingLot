package com.justpark.models.electronics;

import com.justpark.models.parking.Ticket;
import com.justpark.models.parking.interfaces.HasDisplay;
import com.justpark.models.parking.interfaces.IssuesTicket;

public class EntrancePanel extends Electronics implements HasDisplay, IssuesTicket {

    @Override
    public void showMessage(String message) {

    }

    @Override
    public Ticket giveTicket() {
        return null;
    }
}
