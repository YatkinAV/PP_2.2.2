package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    List<Car> listOfCars = carService.createListOfCars(new Car("black", "porshe", "sedan"),
            new Car("white", "BMW", "hatchBack"),
            new Car("red", "mazda", "jip"),
            new Car("blue", "citroen", "universal"),
            new Car("green", "lada", "sport-car"));

    @GetMapping(value = "/cars")
    public String printNumberOfCars(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model) {
        model.addAttribute("carList", carService.getNumberOfCars(listOfCars, count));
        return "/cars";
    }
}
