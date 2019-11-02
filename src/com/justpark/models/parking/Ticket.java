package com.justpark.models.parking;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime issued;
    private TicketStatus ticketStatus;

    public LocalDateTime getIssued() {
        return issued;
    }

    public void setIssued(LocalDateTime issued) {
        this.issued = issued;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
