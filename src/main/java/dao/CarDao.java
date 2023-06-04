package dao;

import model.Car;

import java.util.List;

public interface CarDao {
    List<Car> createListOfCars(Car... cars);

    List<Car> getNumberOfCars(List<Car> carList, int number);
}
