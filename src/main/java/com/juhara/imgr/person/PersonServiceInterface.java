package com.juhara.imgr.person;

import java.lang.Iterable;
import java.util.Optional;

public interface PersonServiceInterface {

    public Iterable<Person> all();
    public Person createPerson(String name);
    public Optional<Person> findPerson(long id);

}
