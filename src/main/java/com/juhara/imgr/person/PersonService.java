package com.juhara.imgr.person;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.Iterable;

@Service
public class PersonService implements PersonServiceInterface {

    @Autowired
    private PersonRepository repository;

    public Iterable<Person> all() {
        return repository.findAll();
    }

    public Person createPerson(String name) {
        Person person = new Person(name);
        repository.save(person);
        return person;
    }

}
