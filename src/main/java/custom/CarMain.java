package custom;


public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.printCarParameters();
        Car car2 = new Car(250,"Ford");
        car2.printCarParameters();
        Car car3 = new Car("Red", 320, "Ferrari");
        car3.printCarParameters();
    }
}
