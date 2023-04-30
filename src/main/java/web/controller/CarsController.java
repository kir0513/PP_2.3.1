package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService1;
import web.service.CarService2;

import java.util.Optional;

@Controller
public class CarsController {

    private final CarService1 carService1;

    private final CarService2 carService2;

    public CarsController(CarService1 carService1, CarService2 carService2) {
        this.carService1 = carService1;
        this.carService2 = carService2;
    }

//
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(required = false, value = "count") Optional<Integer> count, Model model) {
        if (count.isPresent() && count.get() >=0 && count.get() <= 5) {
            model.addAttribute("cars", carService2.getPartOfListCar(count.get()));
        } else {
            model.addAttribute("cars", carService1.getAllCars());
        }
        return "carlist";
    }
}
