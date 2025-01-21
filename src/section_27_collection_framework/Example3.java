package section_27_collection_framework;

import java.util.ArrayList;


class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}


public class Example3 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Pranay"));
        persons.add(new Person("Vaibhav"));
    }
}
