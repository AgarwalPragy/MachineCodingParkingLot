package com.justpark.models.parking.spots;

public abstract class Spot {
    private final SpotType type;
    private SpotStatus status;

    public Spot(SpotType type) {
        this.type = type;
    }

    public SpotType getType() {
        return type;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }
}
