package Vehicule;


public class Voiture extends Vehicule {
    private int nombreDePortes;

    public Voiture(String id, String modele, String marque, int nombreDePortes) {
        super(id, modele, marque);
        if (nombreDePortes <= 0) {
            throw new IllegalArgumentException("Le nombre de portes doit être supérieur à 0");
        }
        this.nombreDePortes = nombreDePortes;
    }

    public int getNombreDePortes() {
        return nombreDePortes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de portes: " + nombreDePortes;
    }
}