package com.example.parking;
import java.util.ArrayList;
import java.util.List;
import com.example.parking.ParkingSpot;

public class Floor {
    private int floor_number;
    private List<ParkingSpot> total_spots = new ArrayList<>();
    private List<ParkingSpot> available_spots = new ArrayList<>();
    
    public Floor(int floor_number, int spots) {
        this.floor_number = floor_number;

        // Assume 20% 2 wheelers, 20% large vehicles, 60% Medium Vehicles
        for (int i = 0; i < spots; i++) {
            if (i < spots * 0.2) {
                total_spots.add(new ParkingSpot("Small"));
            } else if (i >= spots * 0.2 && i < spots * 0.4) {
                total_spots.add(new ParkingSpot("Large"));
            } else {
                total_spots.add(new ParkingSpot("Medium"));
            }
        }
    }

    public List<ParkingSpot> getAvailableSpots() {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingSpot spot : total_spots) {
            if (!spot.isOccupied()) {
                availableSpots.add(spot);
            }
        }
        return availableSpots;
    }

    public void updateAvailableSpots(ParkingSpot spot, String action) {
        if (action.equals("park")) {
            spot.occupy();
        } else if (action.equals("unpark")) {
            spot.vacate();
        }
    }

    public void setFloor(int n) {
        this.floor_number = n;
    }

    public int getFloor() {
        return this.floor_number;
    }
    
    public List<ParkingSpot> getTotalSpots() {
        return total_spots;
    }
}
