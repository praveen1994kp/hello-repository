package com.example.client;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PersonDTO
{

    private String name;

    private String age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.JSON_STYLE);
    }

}
