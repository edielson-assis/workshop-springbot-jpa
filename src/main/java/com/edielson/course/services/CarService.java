package com.edielson.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edielson.course.entities.Car;
import com.edielson.course.repositories.CarRepository;

@Service
public class CarService {
    
    @Autowired
    private CarRepository repository;

    public List<Car> findAll() {
        return repository.findAll();
    }

    public Car findById(Long id) {
        Optional<Car> obj = repository.findById(id);
        return obj.get();
    }
}