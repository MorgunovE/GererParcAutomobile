package Vehicule;
import static java.lang.Integer.parseInt;

/**
 * Classe abstraite Vehicule
 */
public abstract class Vehicule {
    private String id;
    private String modele;
    private String marque;
    private boolean estLoue;

    /**
     * Constructeur de la classe Vehicule
     * @param id L'identifiant du véhicule
     * @param modele Le modèle du véhicule
     * @param marque La marque du véhicule
     */
    public Vehicule(String id, String modele, String marque) {
        if (parseInt(id) <= 0) {
            throw new IllegalArgumentException("L'ID doit être supérieur à 0");
        }
        if (id.isEmpty()) {
            throw new IllegalArgumentException("L'ID ne peut pas être vide");
        }
        if(modele == null || modele.isEmpty()) {
            throw new IllegalArgumentException("Le modèle ne peut pas être vide");
        }
        if(marque == null || marque.isEmpty()) {
            throw new IllegalArgumentException("La marque ne peut pas être vide");
        }
        this.id = id.trim();
        this.modele = modele.trim();
        this.marque = marque.trim();
        this.estLoue = false;
    }

    /**
     * Méthode abstraite toString
     * @return La représentation textuelle du véhicule
     */
    public String getId() {
        return id;
    }

    /**
     * Méthode abstraite toString
     * @return La représentation textuelle du véhicule
     */
    public String getModele() {
        return modele;
    }

    /**
     * Méthode abstraite toString
     * @return La représentation textuelle du véhicule
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Méthode abstraite toString
     * @return La représentation textuelle du véhicule
     */
    public boolean isEstLoue() {
        return estLoue;
    }

    /**
     * Méthode abstraite toString
     * @return La représentation textuelle du véhicule
     */
    public void setEstLoue(boolean estLoue) {
        this.estLoue = estLoue;
    }

    /**
     * Méthode abstraite toString
     * @return La représentation textuelle du véhicule
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Modèle: " + modele + ", Marque: " + marque;
    }
}