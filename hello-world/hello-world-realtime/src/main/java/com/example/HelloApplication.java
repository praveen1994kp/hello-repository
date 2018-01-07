package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.models.Person;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages =
{ "com.example" })
@Configuration
public class HelloApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(HelloApplication.class, args);

        System.out.println(sayHello("Harry"));
        System.out.println(sayHello(new Person.PersonBuilder().name("James")
                .age(35).build().toString()));

    }

    private static String sayHello(String name)
    {
        return "Hello " + name;
    }

}
