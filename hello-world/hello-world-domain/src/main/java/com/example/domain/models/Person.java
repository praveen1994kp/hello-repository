package com.example.domain.models;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Person
{

    private String name;

    private int age;

    private Person()
    {

    }

    private Person(PersonBuilder builder)
    {
        this.name = builder.name;
        this.age = builder.age;

    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.JSON_STYLE);
    }

    public static class PersonBuilder
    {

        private String name;

        private int age;

        public PersonBuilder name(String name)
        {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }

    }

}
