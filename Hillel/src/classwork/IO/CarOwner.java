package classwork.IO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCowalsky on 23.11.2015.
 */
public class CarOwner implements Serializable {

    String owner;
    List<Car> cars = new ArrayList<>();


    public void addCar(Car car){
        cars.add(car);
    }


    public CarOwner(String owner) {
        this.owner = owner;
    }
}
