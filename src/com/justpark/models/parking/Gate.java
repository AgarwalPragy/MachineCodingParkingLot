package com.justpark.models.parking;

import com.justpark.models.Attendant;
import com.justpark.models.AutoExitPanel;
import com.justpark.models.DBObject;

public class Gate extends DBObject {
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
}
