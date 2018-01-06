package com.example;

import com.example.models.Person;

public class HelloApplication
{

    public static void main(String[] args)
    {
        System.out.println(sayHello("Harry"));
        System.out.println(sayHello(new Person.PersonBuilder().name("James")
                .age(35).build().toString()));

    }

    private static String sayHello(String name)
    {
        return "Hello " + name;
    }

}
