package fr.afpa;

import java.time.LocalDate;

public abstract class MotorizedVehicle extends Vehicle {

    // Attributs
    public enum FuelType {
        ESSENCE,
        DIESEL,
        ELECTRIC;
    }

    private FuelType fuelType;
    private int fuelConsumption;
    private boolean integratedGPS;

    // Constructor
    public MotorizedVehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            FuelType fuelType, int fuelConsumption, boolean integratedGPS) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.integratedGPS = integratedGPS;
    }

    // Getters & Setters
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }


    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean isIntegratedGPS() {
        return integratedGPS;
    }

    public void setIntegratedGPS(boolean integratedGPS) {
        this.integratedGPS = integratedGPS;
    }

}
