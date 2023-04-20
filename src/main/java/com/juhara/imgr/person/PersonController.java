package com.juhara.imgr.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Iterable;

@RestController
public class PersonController {

    @Autowired
    private PersonServiceInterface personService;

    @GetMapping("/persons")
    public Iterable<Person> all() {
        return personService.all();
    }

    @PostMapping("/persons")
    public Person createPerson(@RequestParam String name) {
        return personService.createPerson(name);
    }
}
