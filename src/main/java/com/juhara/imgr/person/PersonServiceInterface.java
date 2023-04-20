package com.juhara.imgr.person;

import java.lang.Iterable;

public interface PersonServiceInterface {

    public Iterable<Person> all();
    public Person createPerson(String name);

}
