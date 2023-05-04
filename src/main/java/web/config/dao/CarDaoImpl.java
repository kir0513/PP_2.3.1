package web.config.dao;

import org.springframework.stereotype.Repository;
import web.config.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
//
    private final List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
        Car car1 = new Car("model1", "color1", 101);
        Car car2 = new Car("model2", "color2", 102);
        Car car3 = new Car("model3", "color3", 103);
        Car car4 = new Car("model4", "color4", 104);
        Car car5 = new Car("model5", "color5", 105);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }


    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(carList);
    }

    @Override
    public List<Car> getPartOfListCar(int count) {
        return Collections.unmodifiableList(
                carList.stream().limit(count).collect(Collectors.toList())
        );
    }

}
