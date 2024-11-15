package com.example.parking;
import java.time.Instant;
import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest{
    private ParkingLot parkinglot;
    private Vehicle vehicle;
    public ParkingLotTest(){
        parkinglot = new ParkingLot("test_parking_lot",10);
        vehicle = new Vehicle("test_license_plate","motorcycle");
    }

    @Test
    public void test_constructor(){
        assertEquals(parkinglot.getName(),"test_parking_lot");
    }

    @Test
    public void test_park_vehicle(){
        parkinglot.parkVehicle(vehicle);
        assertNotNull(vehicle.get_assigned_spot());
    }
    @Test
    public void test_unpark_vehicle(){
        parkinglot.unparkVehicle(vehicle);
        assertFalse(vehicle.get_assigned_spot().isOccupied);
    }
    
}