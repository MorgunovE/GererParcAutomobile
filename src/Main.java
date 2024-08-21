import ParcAutomobile.ParcAutomobile;
import Vehicule.Camion;
import Vehicule.Moto;
import Vehicule.Voiture;

public class Main {
    public static void main(String[] args) {

        // Création d'un parc automobile
        ParcAutomobile parc = new ParcAutomobile();

        // Ajout de véhicules au parc
        parc.ajouterVehicule(new Voiture("001", "Civic", "Honda", 4));
        parc.ajouterVehicule(new Camion("101", "F-150", "Ford", 1000));
        parc.ajouterVehicule(new Moto("201", "Ninja", "Kawasaki", 600));

        System.out.println("\n***********Affichage Compact:***********");
        parc.afficherCompact();

        System.out.println("\n***********Louer le véhicule 001:***********");
        parc.louerVehicule("001");

        System.out.println("\n***********Affichage des véhicules Disponibles:***********");
        parc.afficherParDisponibilite(true);

        System.out.println("\n***********Affichage des véhicules Loués:***********");
        parc.afficherParDisponibilite(false);

        System.out.println("\n***********Retourner le véhicule 001:***********");
        parc.retournerVehicule("001");

        System.out.println("\n***********Affichage Par Catégorie:***********");
        parc.afficherParCategorie();

        System.out.println("\n***********Recherche par ID :101***********");
        parc.rechercherVehicule("101");

        System.out.println("\n***********Supprimer le véhicule 201:***********");
        parc.supprimerVehicule("201");

        System.out.println("\n***********Exception: ID doit être supérieur à 0***********");
        try {
            parc.ajouterVehicule(new Voiture("-234523", "Civic", "Honda", 4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: Le modèle ne peut pas être vide***********");
        try {
            parc.ajouterVehicule(new Voiture("001", "", "Honda", 4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: La marque ne peut pas être vide***********");
        try {
            parc.ajouterVehicule(new Voiture("001", "Civic", "", 4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: La capacité de chargement doit être supérieure à 0***********");
        try {
            parc.ajouterVehicule(new Camion("101", "F-150", "Ford", -1000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: La cylindrée doit être supérieure à 0***********");
        try {
            parc.ajouterVehicule(new Moto("201", "Ninja", "Kawasaki", -600));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: Le nombre de portes doit être supérieur à 0***********");
        try {
            parc.ajouterVehicule(new Voiture("001", "Civic", "Honda", -4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: Véhicule non trouvé***********");
        try {
            parc.rechercherVehicule("999");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n***********Exception: Véhicule déjà loué***********");
        parc.louerVehicule("001");
        try {
            parc.louerVehicule("001");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: Véhicule déjà disponible***********");
        parc.retournerVehicule("001");
        try {
            parc.retournerVehicule("001");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: La liste a déjà un véhicule avec cet ID***********");
        try {
            parc.ajouterVehicule(new Voiture("001", "Civic", "Honda", 4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: supprimerVehicule: Véhicule non trouvé***********");
        parc.supprimerVehicule("001");
        try {
            parc.supprimerVehicule("001");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********Exception: Aucun véhicule dans la liste***********");
        parc.supprimerVehicule("101");
        try {
            parc.afficherParDisponibilite(true);
            parc.afficherCompact();
            parc.afficherParCategorie();
            parc.afficherParDisponibilite(false);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}