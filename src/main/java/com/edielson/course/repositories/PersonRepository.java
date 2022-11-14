package com.edielson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edielson.course.entities.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {    
}