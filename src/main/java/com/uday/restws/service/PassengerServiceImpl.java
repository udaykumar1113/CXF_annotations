package com.uday.restws.service;

import com.uday.restws.model.Passenger;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {

    private int counter=148;
    List<Passenger> passengerList=new ArrayList<>();

    public PassengerServiceImpl() {
        Passenger passenger=new Passenger();
        passenger.setId(counter);
        passenger.setPassengerName("DAVE");
        passengerList.add(passenger);
    }

    @Override
    public List<Passenger> getPassengers() {
        return passengerList;
    }

    @Override
    public List<Passenger> getPassengersPage(int start, int size) {
        System.out.println("The size from URL is "+size+" start is "+start);
        return passengerList;
    }

    @Override
    public Passenger addPassenger(Passenger passenger) {
        passenger.setId(counter++);
        passengerList.add(passenger);
        return passenger;
    }

    @Override
    public Passenger addFormPassenger(String firstName, String lastName) {
        Passenger passenger=new Passenger();
        passenger.setPassengerName(firstName+" "+lastName);
        System.out.println("First Name "+firstName);
        passenger.setId(counter++);
        return passenger;
    }
}
