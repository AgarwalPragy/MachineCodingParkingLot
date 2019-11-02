package com.justpark.models.parking;

import com.justpark.models.electronics.AutoExitPanel;
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

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public Attendant getAttendant() {
        return attendant;
    }

    public void setAttendant(Attendant attendant) {
        this.attendant = attendant;
    }

    public AutoExitPanel getExitPanel() {
        return exitPanel;
    }

    public void setExitPanel(AutoExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }
}
