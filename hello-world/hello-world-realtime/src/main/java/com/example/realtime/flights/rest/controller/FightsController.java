package com.example.realtime.flights.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.flight.service.FlightService;
import com.example.domain.models.flight.Flight;

@RestController
@RequestMapping("/flights")
public class FightsController
{

    private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @Autowired
    private FlightService flightService;

    @RequestMapping(method = RequestMethod.GET, value = "/american-flights")
    public List<Flight> getFlights()
    {
        List<Flight> flightList = flightService.getAllFlights();
        logger.info("Returning :" + flightList);
        return flightList;
    }

}
