package fr.afpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vehicle implements Serializable{

    private static final long serialVersionUID = 1L;
    
    // Attributs
    private String brand;
    private String model;
    private String color;
    private LocalDate buyingDate;
    private double pricePerDay;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    // Constructors
    public Vehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buyingDate = buyingDate;
        this.pricePerDay = pricePerDay;
    }

    // Getters & Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(LocalDate buyingDate) {
        this.buyingDate = buyingDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
