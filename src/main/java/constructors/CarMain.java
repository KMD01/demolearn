package constructors;


import objectGenerator.CarGenerator;

import java.util.List;

public class CarMain {

    public static void main(String[] args) {

        List<Car> carsList = CarGenerator.carGenerator(10);
        boolean isListFull = !carsList.isEmpty();
        System.out.println("Czy lista ma elementy: " + isListFull);
        for (Car car : carsList) {
            System.out.println(car.getBrand());
        }


//        Car car1 = new Car();
//        car1.printCarParameters();
//        Car car2 = new Car(250,"Ford");
//        car2.printCarParameters();
//        Car car3 = new Car("Red", 320, "Ferrari");
//        car3.printCarParameters();
    }
}
