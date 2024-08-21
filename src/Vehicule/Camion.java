package Vehicule;

/**
 * Classe Camion
 */
public class Camion extends Vehicule {
    private int capaciteDeChargement;

    /**
     * Constructeur de la classe Camion
     * @param id L'identifiant du camion
     * @param modele Le modèle du camion
     * @param marque La marque du camion
     * @param capaciteDeChargement La capacité de chargement du camion
     */
    public Camion(String id, String modele, String marque, int capaciteDeChargement) {
        super(id, modele, marque);
        if (capaciteDeChargement <= 0) {
            throw new IllegalArgumentException("La capacité de chargement doit être supérieure à 0");
        }
        this.capaciteDeChargement = capaciteDeChargement;
    }

    /**
     * Méthode getCapaciteDeChargement
     * @return La capacité de chargement du camion
     */
    public int getCapaciteDeChargement() {
        return capaciteDeChargement;
    }

    /**
     * Méthode toString
     * @return La représentation textuelle du camion
     */
    @Override
    public String toString() {
        return super.toString() + ", Capacité: " + capaciteDeChargement + " kg";
    }
}