package com.keyin.car;

import com.keyin.videogame.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Iterable<Car> getListOfCar(){
        return carRepository.findAll();
    }

    public void createNewCar(Car car) {
        carRepository.save(car);
    }
}
