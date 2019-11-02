package com.justpark.models.parking.spots;

import com.justpark.models.electronics.ChargingPanel;

public class ElectricSpot extends Spot {
    private ChargingPanel chargingPanel;

    public ElectricSpot() {
        super(SpotType.ELECTRIC);
    }
}
