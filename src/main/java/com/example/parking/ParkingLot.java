package com.example.parking;
import com.example.parking.EntryGate;
import com.example.parking.Vehicle;
import com.example.parking.Floor;
import com.example.parking.ParkingTicket;
import com.example.parking.ParkingSpot;
import java.time.Instant;
import java.util.*;

public class ParkingLot {
    private int id;
    private String name;
    private List<Floor> floors = new ArrayList<>();
    private List<EntryGate> entryGates = new ArrayList<>();

    public ParkingLot(String name, int numFloors) {
        this.name = name;
        this.id = new Random().nextInt(1000);
        for (int i = 0; i < numFloors; i++) {
            this.floors.add(new Floor(i, 100));  // Add floors with 100 spots each
        }
        addEntryGate();
    }

    public void addEntryGate() {
        entryGates.add(EntryGate.GATE_A);
        entryGates.add(EntryGate.GATE_B);
    }

    // Find the first available spot and park the vehicle
    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot parkInSpot = null;
        Floor parkInFloor = null;

        for (Floor floor : floors) {
            List<ParkingSpot> availableSpots = floor.getAvailableSpots();
            for (ParkingSpot spot : availableSpots) {
                if (spot.getSize().equals(vehicle.getSize())) {
                    parkInSpot = spot;
                    parkInFloor = floor;
                    break;
                }
            }
            if (parkInSpot != null) {
                break;
            }
        }

        // If an available spot is found, park the vehicle
        if (parkInSpot != null) {
            parkInSpot.occupy();  
            parkInFloor.updateAvailableSpots(parkInSpot, "park"); 
            vehicle.set_assigned_spot(parkInSpot); 
            // Generate a parking ticket for the vehicle
            ParkingTicket ticket = new ParkingTicket(Instant.now());
            vehicle.setTicket(ticket);
            System.out.println("Vehicle parked at floor " + parkInFloor.getFloor() + ", spot " + parkInSpot);
        } else {
            System.out.println("No available spot for vehicle: " + vehicle.getLicensePlate());
        }
    }

    // Unpark the vehicle and process payment
    public void unparkVehicle(Vehicle vehicle) {
        ParkingSpot spotToVacate = vehicle.get_assigned_spot();
        ParkingTicket ticket = vehicle.getTicket(); 
        
        int payment = ticket.get_parking_fees();
        
        System.out.println("Pay " + payment + " rupees at exit gate.");
        System.out.println("Payment successful.");
        
        spotToVacate.vacate();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
