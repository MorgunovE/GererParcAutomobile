package Vehicule;


public class Moto extends Vehicule {
    private int cylindree;

    public Moto(int id, String modele, String marque, int cylindree) {
        super(id, modele, marque);
        if (cylindree <= 0) {
            throw new IllegalArgumentException("La cylindrée doit être supérieure à 0");
        }
        this.cylindree = cylindree;
    }

    public int getCylindree() {
        return cylindree;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cylindrée: " + cylindree + " cc";
    }
}