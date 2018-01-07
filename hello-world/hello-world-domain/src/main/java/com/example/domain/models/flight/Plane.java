package com.example.domain.models.flight;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public  class Plane
{
    public  String type;
    public  long totalSeats;

    @JsonCreator
    public Plane(@JsonProperty("type") String type,
            @JsonProperty("totalSeats") long totalSeats)
    {
        this.type = type;
        this.totalSeats = totalSeats;
    }

    public String getType()
    {
        return type;
    }

    public long getTotalSeats()
    {
        return totalSeats;
    }
    
    

    public void setType(String type)
    {
        this.type = type;
    }

    public void setTotalSeats(long totalSeats)
    {
        this.totalSeats = totalSeats;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.JSON_STYLE);
    }
}
