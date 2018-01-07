package com.example.domain.flight.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.domain.flight.config.FlightHostConfig;
import com.example.domain.models.flight.Flight;

@Service
public class FlightServiceImpl implements FlightService
{

    private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FlightHostConfig flightHostConfig;

    @SuppressWarnings("unchecked")
    @Override
    public List<Flight> getAllFlights()
    {
        String flightUri = new StringBuilder()
                .append(flightHostConfig.getHost())
                .append(flightHostConfig.getPath()).toString();
        logger.info("Querying URI Path: " + flightUri);
        List<Flight> flightList = new ArrayList<Flight>(
                restTemplate.getForObject(flightUri, List.class));
        logger.info("Received Flights: " + flightList);
        return flightList;

    }

}
