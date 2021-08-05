package com.dor.springcourse0710.dao;

import com.dor.springcourse0710.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Jerry"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Lina"));
        people.add(new Person(++PEOPLE_COUNT, "Eva"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person){
        //people.get(id).setName(person.getName());
        Person toUpdatePerson = show(id);

        toUpdatePerson.setName(person.getName());
    }

    public void delete(int id){
        people.removeIf(p -> p.getId() == id);
    }
}