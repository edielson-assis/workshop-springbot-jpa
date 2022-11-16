package com.edielson.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edielson.course.entities.Person;
import com.edielson.course.services.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonResource {

    @Autowired
    private PersonService service;
    
    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        List<Person> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id) {
        Person obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}