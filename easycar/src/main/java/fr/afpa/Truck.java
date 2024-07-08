package fr.afpa;

import java.time.LocalDate;

public class Truck extends MotorizedVehicle {

    // Attributs
    private double cargoCapacity;

    // Constructors
    public Truck(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, FuelType fuelType,
            int fuelConsumption, boolean integratedGPS, double cargoCapacity) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
        this.cargoCapacity = cargoCapacity;
    }

    // Getters & Setters
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Truck [cargoCapacity=" + cargoCapacity + ", getBrand()=" + getBrand() + ", getFuelType()="
                + getFuelType() + ", getModel()=" + getModel() + ", getFuelConsumption()=" + getFuelConsumption()
                + ", getColor()=" + getColor() + ", isIntegratedGPS()=" + isIntegratedGPS() + ", getBuyingDate()="
                + getBuyingDate() + ", getPricePerDay()=" + getPricePerDay() + "]";
    }

}
