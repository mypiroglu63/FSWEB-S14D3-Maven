package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Parametresiz Constructor
    public CarSkeleton() {
    }

    // Parametreli Constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter metotları
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Metotlar
    public void startEngine() {
        System.out.println("Car: the car's engine is starting.");
    }

    public void drive() {
        System.out.println("Car: the car is accelerating.");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car: the car's engine is running.");
    }
}
