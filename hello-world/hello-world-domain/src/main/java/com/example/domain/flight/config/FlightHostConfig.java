package com.example.domain.flight.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "americanflights")
public class FlightHostConfig
{
    private String host;

    private String path;

    public String getHost()
    {
        return host;
    }

    public String getPath()
    {
        return path;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    
}
