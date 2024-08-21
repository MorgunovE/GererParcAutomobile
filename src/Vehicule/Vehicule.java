package Vehicule;
import static java.lang.Integer.parseInt;

public abstract class Vehicule {
    private String id;
    private String modele;
    private String marque;
    private boolean estLoue;

    public Vehicule(String id, String modele, String marque) {
        if (parseInt(id) <= 0) {
            throw new IllegalArgumentException("L'ID doit être supérieur à 0");
        }
        if(modele == null || modele.isEmpty()) {
            throw new IllegalArgumentException("Le modèle ne peut pas être vide");
        }
        if(marque == null || marque.isEmpty()) {
            throw new IllegalArgumentException("La marque ne peut pas être vide");
        }
        this.id = id;
        this.modele = modele.trim();
        this.marque = marque.trim();
        this.estLoue = false;
    }

    public String getId() {
        return id;
    }

    public String getModele() {
        return modele;
    }

    public String getMarque() {
        return marque;
    }

    public boolean isEstLoue() {
        return estLoue;
    }

    public void setEstLoue(boolean estLoue) {
        this.estLoue = estLoue;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Modèle: " + modele + ", Marque: " + marque;
    }
}