package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar: the electric engine with a battery size of " + batterySize + " kWh is starting.");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar: the electric car is accelerating. It runs " + avgKmPerCharge + " km per charge.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("ElectricCar: the electric engine is running.");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
