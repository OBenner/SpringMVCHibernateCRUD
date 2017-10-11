package ru.obenner.spring.service;

import org.springframework.stereotype.Service;
import ru.obenner.spring.dao.PersonDAO;
import ru.obenner.spring.model.Person;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by omyag on 10.10.2017.
 */
@Service
public class PersonServiceImpl implements PersonService{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }


    @Transactional
    public void updatePerson(Person p) {
        this.personDAO.updatePerson(p);
    }


    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }


    @Transactional
    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }


    @Transactional
    public void removePerson(int id) {
        this.personDAO.removePerson(id);
    }

}
