package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> createListOfCars(Car... cars) {
        return carDao.createListOfCars(cars);
    }

    @Override
    public List<Car> getNumberOfCars(List<Car> carList, int number) {
        return carDao.getNumberOfCars(carList, number);
    }
}
