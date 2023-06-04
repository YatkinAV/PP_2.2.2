package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createListOfCars(Car... cars) {
        List<Car> listToReturn = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            listToReturn.add(cars[i]);
        }
        return listToReturn;
    }

    @Override
    public List<Car> getNumberOfCars(List<Car> carList, int number) {
        List<Car> listToReturn = new ArrayList<>();
        try {
            for (int i = 0; i < number; i++) {
                listToReturn.add(carList.get(i));
            }
        } catch (Exception e) {
            System.out.println("something wrong");
            e.printStackTrace();
        }
        return listToReturn;
    }
}
