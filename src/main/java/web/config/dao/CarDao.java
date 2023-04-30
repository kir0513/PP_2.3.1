package web.config.dao;

import web.config.model.Car;

import java.util.List;

public interface CarDao {
//    List<Car> getCars(int count);

    List<Car> getAllCars();

    List<Car> getPartOfListCar(int count);
   // List<Car> getCars();
}
