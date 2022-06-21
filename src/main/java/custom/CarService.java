package custom;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> carGenerator(int n){
        List<Car> cars = new ArrayList<>();
        for (int i = 0;i<n;i++){
            Car car = new Car();
            cars.add(car);}
        return cars;
    };



}
