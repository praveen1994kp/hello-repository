package com.example.domain.service;

import java.util.List;

import com.example.domain.models.Person;

public interface PersonService
{
    public List<Person> getPerson();

    public void addPerson(Person person);

}
