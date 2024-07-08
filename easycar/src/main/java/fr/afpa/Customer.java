package fr.afpa;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Comparable<Customer>, Serializable{

    private static final long serialVersionUID = 1L;

    // Attributs
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    // Constructors
    public Customer(String firstName, String lastName, String address, String city, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Méthodes
    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", postalCode=" + postalCode + "]";
    }

    // totalMoneySpent() : double : renvoie la somme totale de l’argent dépensé par
    // l’utilisateur
    public double totalMoneySpent() {
        double total = 0.0;
        for (Reservation reservation : reservations) {
            total += reservation.totalPrice();
        }
        return total;
    }

    // addReservation(reservation : Reservation) : void : ajoute une réservation au
    // client
    public void addReservation(Reservation reservation) {
        // Vérifier si la réservation n'existe pas déjà
        if (!reservations.contains(reservation)) {
            reservations.add(reservation);
            System.out.println("La réservation : " + reservation + " a été ajoutée pour le client : " + this.firstName + " " + this.lastName);
        } else {
            System.out.println("La réservation : " + reservation + " existe déjà pour le client : " + this.firstName + " " + this.lastName);
        }
    }

    // removeReservation(reservation : Reservation) : boolean, supprime une
    // reservation, renvoie VRAI si la réservation a pu être supprimée, sinon
    // renvoie FAUX
    public boolean removeReservation(Reservation reservation) {
        // Vérifier si la réservation existe dans la liste
        if (reservations.contains(reservation)) {
            System.out.println("La réservation : " + reservation + " a été retirée pour le client : " + this.firstName + " " + this.lastName);
            reservations.remove(reservation);
            return true;
        } else {
            System.out.println("La réservation : " + reservation + " n'a pas été trouvée pour le client : " + this.firstName + " " + this.lastName);
            return false;
        }
    }

    @Override
    public int compareTo(Customer other) {
       return Double.compare(this.totalMoneySpent(), other.totalMoneySpent());
    }
}
