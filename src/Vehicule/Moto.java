package Vehicule;

/**
 * Classe Moto
 */
public class Moto extends Vehicule {
    private int cylindree;

    /**
     * Constructeur de la classe Moto
     * @param id L'identifiant de la moto
     * @param modele Le modèle de la moto
     * @param marque La marque de la moto
     * @param cylindree La cylindrée de la moto
     */
    public Moto(String id, String modele, String marque, int cylindree) {
        super(id, modele, marque);
        if (cylindree <= 0) {
            throw new IllegalArgumentException("La cylindrée doit être supérieure à 0");
        }
        this.cylindree = cylindree;
    }

    /**
     * Méthode getCylindree
     * @return La cylindrée de la moto
     */
    public int getCylindree() {
        return cylindree;
    }

    /**
     * Méthode toString
     * @return La représentation textuelle de la moto
     */
    @Override
    public String toString() {
        return super.toString() + ", Cylindrée: " + cylindree + " cc";
    }
}