package methods;

import custom.Car;

import java.util.Optional;

public class NullableMethod {

    public static boolean checkIfCarHaveColor(Car car) {
        return Optional.ofNullable(car.getColor()).isPresent();
    }
}
