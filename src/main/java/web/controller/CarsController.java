package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarsController {

    private final CarService carService1;


    public CarsController(CarService carService1) {
        this.carService1 = carService1;

    }


    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(required = false, value = "count") Optional<Integer> count, Model model) {
        if (count.isPresent() && count.get() >= 0 && count.get() <= 5) {
            model.addAttribute("cars", carService1.getPartOfListCar(count.get()));
        } else {
            model.addAttribute("cars", carService1.getAllCars());
        }
        return "carlist";
    }
}
