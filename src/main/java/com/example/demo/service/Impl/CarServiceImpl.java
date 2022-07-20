package com.example.demo.service.Impl;

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepository;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component

public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            return car.get();
        }
        else {
            return null;
        }



    }

    @Override
    public Car createNewCar(Car car) {
        return carRepository.save(car) ;
    }
}
