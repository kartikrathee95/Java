package com.example.parking;
import com.example.parking.ParkingTicket;
import com.example.parking.ParkingSpot;

public class Vehicle {
    private String licensePlate;
    private String type; // "motorcycle", "car", "bus"
    private int id;
    public static int nextId = 1;
    private ParkingSpot assigned_spot;
    private ParkingTicket ticket;
    
    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.id = nextId++;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    
    public String getSize(){
        if(type=="motorcycle"){
            return "Small";
        }
        else if(type=="bus" || type=="truck"){
            return "Large";
        }
        return "Medium";
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void set_assigned_spot(ParkingSpot spot){
        this.assigned_spot = spot;
    }

    public ParkingSpot get_assigned_spot(){
        return this.assigned_spot;
    }

    public void setTicket(ParkingTicket ticket){
        this.ticket = ticket;
    }
    
    public ParkingTicket getTicket(){
        return this.ticket;
    }
}
