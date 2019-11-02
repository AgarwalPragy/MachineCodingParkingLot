package com.justpark.models.parking;

import com.justpark.exceptions.MalformedVehicleException;
import com.justpark.exceptions.SpotAlreadyFreeException;
import com.justpark.exceptions.SpotAlreadyOccupiedException;
import com.justpark.exceptions.SpotNotAddedException;
import com.justpark.models.electronics.CustomerInfoPortal;
import com.justpark.models.electronics.DisplayBoard;
import com.justpark.models.parking.spots.Spot;
import com.justpark.models.parking.spots.SpotStatus;
import com.justpark.models.parking.spots.SpotType;
import com.justpark.models.vehicles.Vehicle;
import com.justpark.models.vehicles.VehicleType;

import java.util.*;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
    private Map<SpotType, Set<Spot>> freeSpots;
    private Map<SpotType, Set<Spot>> occupiedSpots;
    private DisplayBoard displayBoard;
    private String name;

    public Floor(String name) {
        setName(name);
        displayBoard = new DisplayBoard();
        freeSpots = new HashMap<>();
        occupiedSpots = new HashMap<>();
        customerInfoPortal = new CustomerInfoPortal();
    }

    private void populateMap(SpotType type) {
        if(!freeSpots.containsKey(type))
            freeSpots.put(type, new HashSet<>());
        if(!occupiedSpots.containsKey(type))
            occupiedSpots.put(type, new HashSet<>());
    }

    public void addSpot(Spot spot) throws SpotAlreadyOccupiedException {
        populateMap(spot.getType());

        if (!spot.getStatus().equals(SpotStatus.FREE) || occupiedSpots.get(spot.getType()).contains(spot))
            throw new SpotAlreadyOccupiedException("Can't move " + spot.toString() + " because it is occupied!");
        freeSpots.get(spot.getType()).add(spot);
    }

    public synchronized void park(Spot spot, Vehicle vehicle) throws MalformedVehicleException, SpotAlreadyOccupiedException, SpotNotAddedException {
        populateMap(spot.getType());
        if(!freeSpots.get(spot.getType()).contains(spot))
            throw new SpotNotAddedException("Spot must be added to floor before it can be parked in");
        spot.park(vehicle);
        freeSpots.get(spot.getType()).remove(spot);
        occupiedSpots.get(spot.getType()).add(spot);
        updateDisplayBoard();
    }

    public synchronized Vehicle unPark(Spot spot) throws SpotAlreadyFreeException, SpotNotAddedException {
        populateMap(spot.getType());
        if(!occupiedSpots.get(spot.getType()).contains(spot))
            throw new SpotNotAddedException("Spot must be added to floor before it can be unparked.");
        Vehicle vehicle = spot.unPark();
        occupiedSpots.get(spot.getType()).remove(spot);
        freeSpots.get(spot.getType()).add(spot);
        updateDisplayBoard();
        return vehicle;
    }

    private void updateDisplayBoard() {
        StringBuilder message = new StringBuilder();
        message.append(this.toString()).append("\n");
        for(SpotType type: freeSpots.keySet()) {
            Set<Spot> spots = freeSpots.get(type);
            message.append("\n").append(type.toString()).append(": ");
            if(spots.size() == 0)
                message.append("No free spots :(");
            else
                message.append(spots.iterator().next().toString());
        }
        displayBoard.showMessage(message.toString());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
