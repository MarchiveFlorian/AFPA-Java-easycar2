package fr.afpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import fr.afpa.MotorizedVehicle.FuelType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Instanciation de chaque types de véhicules
        Vehicle car = new Car("BMW", "prout", "black", LocalDate.of(2005, 02, 21), 500, FuelType.ESSENCE, 50, false, 5);
        Vehicle truck = new Truck("Jsaispas", "prout", "red", LocalDate.of(2014, 02, 21), 1500, FuelType.ESSENCE, 150, true, 3);
        Vehicle bike = new Bike("Velo++", "prout", "blue", LocalDate.of(2022, 02, 21), 100, 'L');
        
        //Instanciation de clients
        Customer a = new Customer("Alain", "Deloin", "rue du apeupres", "Strasbourg", "99999");
        Customer b = new Customer("Stephane", "Bern", "Le chateau", "Chateauroux", "01000");
        Customer c = new Customer("John", "Doe", "x", "x", "00000");

        //Instanciation de réservations + lien entre un vehicle et sa réservation
        Reservation r1 = new Reservation(LocalDate.of(2024, 07, 01), LocalDate.of(2024, 07, 10), false, car);
        Reservation r2 = new Reservation(LocalDate.of(2024, 07, 01), LocalDate.of(2024, 07, 10), false, truck);
        Reservation r3 = new Reservation(LocalDate.of(2024, 07, 01), LocalDate.of(2024, 07, 10), false, bike);

        //Création des liens entre les clients et leur réservation(s)
        a.addReservation(r1);
        a.addReservation(r2);
        b.addReservation(r3);
        c.addReservation(r2);

        //Test de la méthode totalMoneySpent
        a.totalMoneySpent();
        b.totalMoneySpent();
        c.totalMoneySpent();


        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(a);
        customers.add(b);
        customers.add(c);

        Collections.sort(customers);

        for (Customer customer : customers) {
            System.out.println(customer + " - Total dépensé : \n" + customer.totalMoneySpent());
        }

        CustomerManager.inputSerialize(customers);
    }
}
