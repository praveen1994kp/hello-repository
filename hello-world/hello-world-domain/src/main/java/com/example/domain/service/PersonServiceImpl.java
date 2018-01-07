package com.example.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.models.Person;


@Service
public class PersonServiceImpl implements PersonService
{

    private static List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> getPerson()
    {
        return personList;
    }

    @Override
    public void addPerson(Person person)
    {
        personList.add(person);

    }

}
