package util.optional;

import constructors.Car;
import java.util.Optional;

public class OptionalMethod {

    public static boolean checkIfNull(Car car) {
        return Optional.ofNullable(car.getColor()).isPresent();
    }
}
