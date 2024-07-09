package com.keyin.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/getListOfAllCars")
    public Iterable<Car> getAllCar(){
        return carService.getListOfCar();
    }
    @PostMapping("/createNewCar")
    public Car createNewCar(@RequestBody Car car) {
        carService.createNewCar(car);
        return car;
    }
}
