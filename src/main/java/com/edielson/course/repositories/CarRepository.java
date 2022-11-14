package com.edielson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edielson.course.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {   
}