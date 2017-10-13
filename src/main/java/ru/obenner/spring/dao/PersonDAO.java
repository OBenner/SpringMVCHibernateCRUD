package ru.obenner.spring.dao;

import ru.obenner.spring.model.Person;

import java.util.List;

/**
 *
 *
 * Created by omyag on 10.10.2017.
 */
public interface PersonDAO {

     void addPerson(Person p);
     void updatePerson(Person p);
     List<Person> listPersons();
     Person getPersonById(int id);
     void removePerson(int id);
}
