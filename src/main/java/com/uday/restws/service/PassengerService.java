package com.uday.restws.service;

import com.uday.restws.model.Passenger;

import javax.ws.rs.*;
import java.util.List;

@Path("/passengerservice")
@Produces("application/xml")
@Consumes("application/xml,application/x-www-form-urlencoded")
public interface PassengerService {

    @Path("/passengers")
    @GET
    List<Passenger> getPassengers();

    @Path("/passengerspage")
    @GET
    List<Passenger> getPassengersPage(@QueryParam("start") int start,
                                      @QueryParam("size") int size);


    Passenger addPassenger(Passenger passenger);

    @Path("/passengerform")
    @POST
    Passenger addFormPassenger(@FormParam("firstName") String firstName,
                               @FormParam("lastName") String lastName);
}
