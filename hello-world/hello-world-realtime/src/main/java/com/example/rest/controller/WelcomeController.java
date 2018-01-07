package com.example.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Person;

@RestController
public class WelcomeController
{
    @RequestMapping(method = RequestMethod.GET)
    public String welcomeMessage()
    {
        return "Hello User!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/person")
    public List<Person> getPerson()
    {
        return null;
    }

}
