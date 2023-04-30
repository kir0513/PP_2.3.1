package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.dao.CarDao;
import web.config.model.Car;

import java.util.List;

@Service
public class CarService1Impl implements CarService1{
//

    private final CarDao carDao;

    public CarService1Impl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
