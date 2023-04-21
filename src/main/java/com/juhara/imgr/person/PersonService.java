package com.juhara.imgr.person;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.Iterable;
import java.util.Optional;

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

    public Optional<Person> findPerson(long id) {
        return repository.findById(id);
    }

    public Optional<Person> updatePerson(long id, String name) {
        Optional<Person> personData = findPerson(id);
        if (personData.isPresent()) {
            Person person = personData.get();
            person.setName(name);
            repository.save(person);
        }
        return personData;
    }

}
