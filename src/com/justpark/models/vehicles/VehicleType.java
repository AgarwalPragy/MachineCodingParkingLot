package com.justpark.models.vehicles;

import com.justpark.models.parking.spots.SpotType;

import java.util.Arrays;
import java.util.List;

public enum VehicleType {
    CAR(Arrays.asList(SpotType.COMPACT, SpotType.LARGE)),
    TRUCK(Arrays.asList(SpotType.LARGE)),
    VAN(Arrays.asList(SpotType.LARGE)),
    MOTORCYCLE(Arrays.asList(SpotType.MOTORCYCLE, SpotType.COMPACT, SpotType.LARGE)),
    ELECTRIC(Arrays.asList(SpotType.ELECTRIC));

    private final List<SpotType> fitsIn;

    VehicleType(List<SpotType> fitsIn) {
        this.fitsIn = fitsIn;
    }

    public List<SpotType> getFitsIn() {
        return fitsIn;
    }
}
