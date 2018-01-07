package com.example.domain.flight.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.domain.models.flight.Flight;

@Service
public class FlightServiceImpl implements FlightService
{

    private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    private static final String AMERICAN_FLIGHTS_HOST = "http://training-american-ws.cloudhub.io";

    private static final String FLIGHTS_PATH = "/api/flights";

    @SuppressWarnings("unchecked")
    @Override
    public List<Flight> getAllFlights()
    {
        List<Flight> flightList = new ArrayList<Flight>(restTemplate
                .getForObject(new StringBuilder().append(AMERICAN_FLIGHTS_HOST)
                        .append(FLIGHTS_PATH).toString(), List.class));
        logger.info("Received Flights: " + flightList);
        return flightList;

    }

}
