package com.justpark.models.parking;

import com.justpark.models.electronics.EntrancePanel;

public class GroundFloor extends Floor {
    private EntrancePanel entrancePanel;

    public EntrancePanel getEntrancePanel() {
        return entrancePanel;
    }

    public void setEntrancePanel(EntrancePanel entrancePanel) {
        this.entrancePanel = entrancePanel;
    }
}
