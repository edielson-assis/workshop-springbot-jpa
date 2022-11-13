package com.edielson.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edielson.course.entities.Person;

@RestController
@RequestMapping(value = "/owners")
public class PersonResource {
    
    @GetMapping
    public ResponseEntity<Person> findAll() {
        Person p = new Person(1L, "Greg");
        return ResponseEntity.ok().body(p);
    }
}