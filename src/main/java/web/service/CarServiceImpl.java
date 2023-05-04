package web.service;

import org.springframework.stereotype.Service;
import web.config.dao.CarDao;
import web.config.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
//

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
    @Override
     public List<Car> getPartOfListCar(int count) {
        return carDao.getPartOfListCar(count);
    }
}
