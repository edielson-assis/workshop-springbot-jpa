package com.edielson.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.edielson.course.entities.Car;
import com.edielson.course.entities.Person;
import com.edielson.course.repositories.CarRepository;
import com.edielson.course.repositories.PersonRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Person p1 = new Person(null, "Greg Brow");
        Person p2 = new Person(null, "John Gree");
        Person p3 = new Person(null, "Martha White");
        Person p4 = new Person(null, "Chris Blue");

        Car c1 = new Car(null, "Fox", 2015, "");
        Car c2 = new Car(null, "Van Plus", 2017, "");
        Car c3 = new Car(null, "Cross Hatch", 2014, "");
        Car c4 = new Car(null, "Convert", 1998, "");

        personRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
        carRepository.saveAll(Arrays.asList(c1, c2, c3, c4));        
    }   
}