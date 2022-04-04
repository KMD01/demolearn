package custom;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
public class Car {
    private String color;
    private int maxSpeed;
    private String brand;

    public Car() {
        this.color = "white";
        this.maxSpeed = 180;
        this.brand = "Fiat";
    }
    public Car(int maxSpeed, String brand) {
        this();
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    public Car(String color, int maxSpeed, String brand) {
        this(maxSpeed, brand);
        this.color = color;
    }
    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s",
                color, maxSpeed, brand));
    }
}




