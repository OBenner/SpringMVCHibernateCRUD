package ru.obenner.spring.model;

import javax.persistence.*;

/**
 * Simple JavaBean domain object representing an Person.
 * Created by omyag on 10.10.2017.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * Id of the person
     * */
    private int id;

    /**
     * name of the person
     */
    private String name;

    /**
     * country of the person
     */
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", country=" + country;
    }
}
