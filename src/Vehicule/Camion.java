package Vehicule;

// Classe pour les camions
public class Camion extends Vehicule {
    private int capaciteDeChargement;

    public Camion(int id, String modele, String marque, int capaciteDeChargement) {
        super(id, modele, marque);
        if (capaciteDeChargement <= 0) {
            throw new IllegalArgumentException("La capacité de chargement doit être supérieure à 0");
        }
        this.capaciteDeChargement = capaciteDeChargement;
    }

    public int getCapaciteDeChargement() {
        return capaciteDeChargement;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacité: " + capaciteDeChargement + " kg";
    }
}