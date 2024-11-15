package com.example.parking;

import java.util.*;


public class ParkingSpot {
    private int id;
    private String size; // "small", "medium", "large"
    public boolean isOccupied;
    public static int nextId = 1;
    
    public ParkingSpot(String size) {
        this.id = nextId++;
        this.size = size;
        this.isOccupied = false;    
    }

    public int getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        this.isOccupied = true;
    }

    public void vacate() {
        this.isOccupied = false;
    }
}
