package com.juhara.imgr.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Iterable;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonServiceInterface personService;

    @GetMapping("/persons")
    public Iterable<Person> all() {
        return personService.all();
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> findPerson(@PathVariable long id) {
        return personService.findPerson(id);
    }

    @PostMapping("/persons")
    public Person createPerson(@RequestParam String name) {
        return personService.createPerson(name);
    }

    @PutMapping("/persons/{id}")
    public Optional<Person> updatePerson(@PathVariable long id, @RequestParam String name) {
        return personService.updatePerson(id, name);
    }
}
