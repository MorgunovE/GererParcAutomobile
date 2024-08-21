package Vehicule;

/**
 * Classe Voiture
 */
public class Voiture extends Vehicule {
    private int nombreDePortes;

    /**
     * Constructeur de la classe Voiture
     * @param id L'identifiant de la voiture
     * @param modele Le modèle de la voiture
     * @param marque La marque de la voiture
     * @param nombreDePortes Le nombre de portes de la voiture
     */
    public Voiture(String id, String modele, String marque, int nombreDePortes) {
        super(id, modele, marque);
        if (nombreDePortes <= 0) {
            throw new IllegalArgumentException("Le nombre de portes doit être supérieur à 0");
        }
        this.nombreDePortes = nombreDePortes;
    }

    /**
     * Méthode getNombreDePortes
     * @return Le nombre de portes de la voiture
     */
    public int getNombreDePortes() {
        return nombreDePortes;
    }

    /**
     * Méthode toString
     * @return La représentation textuelle de la voiture
     */
    @Override
    public String toString() {
        return super.toString() + ", Nombre de portes: " + nombreDePortes;
    }
}