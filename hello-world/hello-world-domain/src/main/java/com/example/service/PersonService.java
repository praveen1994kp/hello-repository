package com.example.service;

import java.util.List;

import com.example.models.Person;

public interface PersonService
{
    public List<Person> getPerson();

    public void addPerson(Person person);

}
