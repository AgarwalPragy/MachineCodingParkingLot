package com.justpark.models.parking.spots;

import com.justpark.models.electronics.ChargingPanel;

public class ElectricSpot extends Spot {
    private ChargingPanel chargingPanel;

    public ElectricSpot() {
        super(SpotType.ELECTRIC);
    }

    public ChargingPanel getChargingPanel() {
        return chargingPanel;
    }

    public void setChargingPanel(ChargingPanel chargingPanel) {
        this.chargingPanel = chargingPanel;
    }
}
