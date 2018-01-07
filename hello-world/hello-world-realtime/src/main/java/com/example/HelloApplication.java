package com.example;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.domain.models.Person;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages =
{ "com.example" })
@Configuration
public class HelloApplication
{
    
    private static Logger logger = org.slf4j.LoggerFactory.getLogger(HelloApplication.class);

    public static void main(String[] args)
    {
        logger.info("Starting Hello Application as Standalone App...");
        SpringApplication.run(HelloApplication.class, args);
    }

}
