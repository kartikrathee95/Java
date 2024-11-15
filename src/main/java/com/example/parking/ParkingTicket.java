package com.example.parking;
import java.time.Duration;
import java.time.Instant;

public class ParkingTicket {
    private int id;
    private Instant start_time;
    private Instant exit_time;
    public static int nextId = 1;

    public ParkingTicket(Instant start_time) {
        this.start_time = start_time;
        this.id = nextId++;
    }

    public Instant get_start_time() {
        return this.start_time;
    }

    public void set_exit_time(Instant exit_time) {
        this.exit_time = exit_time;
    }

    public Instant get_exit_time() {
        return this.exit_time;
    }

    // Method to calculate parking time in minutes
    public long get_parking_time() {
        try {
            long parking_time = Duration.between(this.start_time, this.exit_time).toMinutes();
            return parking_time;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
        return 0;
    }

    public int get_parking_fees() {
        long parking_time = get_parking_time();
        return (int) (parking_time * 2); // simple algorithm: 2 Rs per minute
    }
}
