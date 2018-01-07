package com.example.domain.models.flight;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Flight
{
    public long iD;
    public String code;
    public long price;
    public String departureDate;
    public String origin;
    public String destination;
    public long emptySeats;
    public Plane plane;

    @JsonCreator
    public Flight(@JsonProperty("iD") long iD,
            @JsonProperty("code") String code,
            @JsonProperty("price") long price,
            @JsonProperty("departureDate") String departureDate,
            @JsonProperty("origin") String origin,
            @JsonProperty("destination") String destination,
            @JsonProperty("emptySeats") long emptySeats,
            @JsonProperty("plane") Plane plane)
    {
        this.iD = iD;
        this.code = code;
        this.price = price;
        this.departureDate = departureDate;
        this.origin = origin;
        this.destination = destination;
        this.emptySeats = emptySeats;
        this.plane = plane;
    }

    public long getiD()
    {
        return iD;
    }

    public String getCode()
    {
        return code;
    }

    public long getPrice()
    {
        return price;
    }

    public String getDepartureDate()
    {
        return departureDate;
    }

    public String getOrigin()
    {
        return origin;
    }

    public String getDestination()
    {
        return destination;
    }

    public long getEmptySeats()
    {
        return emptySeats;
    }

    public Plane getPlane()
    {
        return plane;
    }

    public void setiD(long iD)
    {
        this.iD = iD;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public void setPrice(long price)
    {
        this.price = price;
    }

    public void setDepartureDate(String departureDate)
    {
        this.departureDate = departureDate;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setEmptySeats(long emptySeats)
    {
        this.emptySeats = emptySeats;
    }

    public void setPlane(Plane plane)
    {
        this.plane = plane;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.JSON_STYLE);
    }

}
