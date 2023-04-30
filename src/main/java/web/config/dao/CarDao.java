package web.config.dao;

import web.config.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAllCars();

    List<Car> getPartOfListCar(int count);

}
