package com.example.realtime.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.PersonDTO;
import com.example.domain.models.Person;
import com.example.domain.service.PersonService;

@RestController
@RequestMapping(value="/welcome")
public class WelcomeController
{
    @Autowired
    private PersonService personService;

    private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    @RequestMapping(method = RequestMethod.GET)
    public String welcomeMessage()
    {
        return "Hello User!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/person")
    public List<Person> getPerson()
    {
        return personService.getPerson();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/person")
    public void addPerson(@RequestBody PersonDTO person)
    {
        personService.addPerson(translateToPerson(person));
    }

    private Person translateToPerson(PersonDTO person)
    {
        try
        {
            logger.info("Received input for Post : " + person);
            return new Person.PersonBuilder().name(person.getName())
                    .age(Integer.valueOf(person.getAge())).build();
        } catch (NumberFormatException numberFormatException)
        {
            logger.error(numberFormatException.getLocalizedMessage());
            return null;
        }
    }

}
