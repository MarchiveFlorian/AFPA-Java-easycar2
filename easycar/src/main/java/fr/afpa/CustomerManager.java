package fr.afpa;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {

    private static final String FILE_NAME = "customers.ser";

    public static void main(String[] args) {
    }

    public static void inputSerialize(ArrayList<Customer> customers) {
        Scanner scanner = new Scanner(System.in);
    

        while (true) {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Sérialiser les objets Customer");
            System.out.println("2. Désérialiser les objets Customer");
            System.out.println("3. Quitter");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    serializeCustomers(customers);
                    break;
                case 2:
                    customers = deserializeCustomers();
                    if (customers != null) {
                        for (Customer customer : customers) {
                            System.out.println(customer);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix non valide, veuillez réessayer.");
            }
        }
    }


    public static void serializeCustomers(ArrayList<Customer> customers) {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME); // ouvre un flux de sortie vers le fichier
                                                                         // nommé 'FILE_NAME'
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) { // créer un flux de sortie d'objets qui
                                                                            // permet de serialiser des objets java
            out.writeObject(customers); // writeObject sérialise l'objet et l'écrit dans le fichier
            System.out.println("Les objets Customer ont été sérialisés et sauvegardés dans " + FILE_NAME);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Customer> deserializeCustomers() {
        ArrayList<Customer> customers = null;
        try (FileInputStream fileIn = new FileInputStream(FILE_NAME); // ouvre un flux d'entrée vers le fichier
                ObjectInputStream in = new ObjectInputStream(fileIn)) { // créer un flux d'entrée
            customers = (ArrayList<Customer>) in.readObject(); // lit l'objet sérialisé et le convertit en arraylist
            System.out.println("Les objets Customer ont été désérialisés depuis " + FILE_NAME);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Customer non trouvée");
            c.printStackTrace();
        }
        return customers;
    }
}