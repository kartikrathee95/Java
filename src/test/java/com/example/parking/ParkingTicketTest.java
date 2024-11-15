package com.example.parking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.time.Instant;
import java.time.Duration;


public class ParkingTicketTest{

    private ParkingTicket ticket;

    public ParkingTicketTest(){
        ticket = new ParkingTicket(Instant.now());
    }

    @Test 
    public void testParkingTicketConstructor(){
        assertNotNull(ticket.get_start_time());
    }
    @Test
    public void get_parking_time(){
        long parking_time = ticket.get_parking_time();
        assertNotNull(parking_time);
    }
    @Test
    public void get_parking_fees(){
        Instant exit_time = Instant.now();
        ticket.set_exit_time(exit_time);
        int parking_fees = ticket.get_parking_fees();
        int parkingfees_expected = (int)(Duration.between(ticket.get_start_time(), ticket.get_exit_time()).toMinutes()*2);
        assertEquals(parking_fees,parkingfees_expected);

    }
}