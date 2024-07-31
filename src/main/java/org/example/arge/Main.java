package org.example.arge;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("GasCar", "A car with a gas engine", 15.0, 6);
        CarSkeleton electricCar = new ElectricCar("ElectricCar", "A car with an electric engine", 300.0, 75);
        CarSkeleton hybridCar = new HybridCar("HybridCar", "A car with both gas and electric engines", 20.0, 50, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        car.startEngine();
        car.drive();
        System.out.println("Car type: " + car.getClass().getSimpleName());
        System.out.println();
    }
}
