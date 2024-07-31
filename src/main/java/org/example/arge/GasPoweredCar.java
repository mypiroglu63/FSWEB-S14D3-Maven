package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar: the gas engine with " + cylinders + " cylinders is starting.");
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar: the gas powered car is accelerating. It runs " + avgKmPerLitre + " km per litre.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPoweredCar: the gas engine is running.");
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
