package com.edielson.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edielson.course.entities.Car;

@RestController
@RequestMapping(value = "/cars")
public class CarResource {
    
    @GetMapping
    public ResponseEntity<Car> findAll() {
        Car c = new Car(1L, "Fox", 2015);
        return ResponseEntity.ok().body(c);
    }
}