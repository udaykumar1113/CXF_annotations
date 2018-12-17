package com.uday.restws.service;

import com.uday.restws.model.Passenger;

import javax.ws.rs.*;
import java.util.List;

@Path("/passengerservice")
@Produces("application/xml")
@Consumes("application/xml")
public interface PassengerService {

    @GET
    @Path("/patients")
    public List<Passenger> getPassengers();

    @POST
    @Path("/patient")
    public int addPassenger(Passenger passenger);
}
