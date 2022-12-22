package oca.chapter7.vehicles;

public class Main {
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
        System.out.println(car.engine);
    }

}
