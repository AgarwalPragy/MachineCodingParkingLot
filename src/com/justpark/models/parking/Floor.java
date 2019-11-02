package com.justpark.models.parking;

import com.justpark.models.electronics.CustomerInfoPortal;
import com.justpark.models.electronics.DisplayBoard;
import com.justpark.models.parking.spots.Spot;

import java.util.List;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
    private List<Spot> spots;
    private DisplayBoard displayBoard;
}
