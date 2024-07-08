package fr.afpa;

import java.time.LocalDate;


public class Car extends MotorizedVehicle {

    // Attributs
    private int seats;

    // Constructors
    public Car(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, FuelType fuelType,
            int fuelConsumption, boolean integratedGPS, int seats) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
        this.seats = seats;
    }

    // Getters & Setters
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car [seats=" + seats + ", getBrand()=" + getBrand() + ", getFuelType()=" + getFuelType()
                + ", getModel()=" + getModel() + ", getFuelConsumption()=" + getFuelConsumption() + ", getColor()="
                + getColor() + ", isIntegratedGPS()=" + isIntegratedGPS() + ", getBuyingDate()=" + getBuyingDate()
                + ", getPricePerDay()=" + getPricePerDay() + "]";
    }

}
