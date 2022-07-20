package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.Impl.CarServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarServiceImpl service;
    @GetMapping("")
    List<Car> getALlCars(){
        return service.getAllCars();
    }

    Car findById(@PathVariable Long id)
    {
        return service.getById(id);
    }
    @PostMapping("/create")
    ResponseEntity<Car> createNewCar(@RequestBody Car car) throws JsonProcessingException {
        Car dt = service.createNewCar(car);
        return ResponseEntity.ok(dt);



    }

}
