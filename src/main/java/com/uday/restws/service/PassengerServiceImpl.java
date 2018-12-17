package com.uday.restws.service;

import com.uday.restws.model.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    private int counter=148;
    List<Passenger> passengerList=new ArrayList<>();

    @Override
    public List<Passenger> getPassengers() {
        return passengerList;
    }

    @Override
    public int addPassenger(Passenger passenger) {
        passenger.setId(counter++);
        passengerList.add(passenger);
        return counter;
    }
}
