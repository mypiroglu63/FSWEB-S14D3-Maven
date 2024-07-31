package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar: the hybrid engine with " + cylinders + " cylinders and a battery size of " + batterySize + " kWh is starting.");
    }

    @Override
    public void drive() {
        System.out.println("HybridCar: the hybrid car is accelerating. It runs " + avgKmPerLitre + " km per litre and " + avgKmPerCharge() + " km per charge.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridCar: the hybrid engine is running.");
    }

    private double avgKmPerCharge() {
        return avgKmPerLitre * batterySize / 100.0;
    }

    public double getAvgKmPerLiter(){
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
