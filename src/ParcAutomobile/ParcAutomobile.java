package ParcAutomobile;
import Vehicule.Vehicule;
import Vehicule.Voiture;
import Vehicule.Camion;
import Vehicule.Moto;

import java.util.ArrayList;
import java.util.List;


public class ParcAutomobile {
    private List<Vehicule> vehicules;

    public ParcAutomobile() {
        this.vehicules = new ArrayList<>();
    }

    public void ajouterVehicule(Vehicule vehicule) {
        try {
            if (!vehicules.isEmpty()) {
                for (Vehicule v : vehicules) {
                    if (v.getId() == vehicule.getId()) {
                        throw new IllegalArgumentException("Un véhicule avec cet ID existe déjà");
                    }
                }
            }
            vehicules.add(vehicule);
            System.out.println("Véhicule [" + vehicule.getMarque() + " " + vehicule.getModele() + "] ajouté avec succès.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void supprimerVehicule(int id) {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return;
            } else if( vehicules.size() == 1 && vehicules.getFirst().getId() == id) {
                if(vehicules.removeFirst() != null) {
                    System.out.println("Véhicule [" + id + "] supprimé avec succès.");
                } else {
                    System.out.println("Erreur lors de la suppression du véhicule [" + id + "]");
                }
                return;
            }
            for (Vehicule v : vehicules) {
                if (v.getId() == id) {
                    if(vehicules.remove(v)) {
                        System.out.println("Véhicule [" + id + "] supprimé avec succès.");
                    } else {
                        System.out.println("Erreur lors de la suppression du véhicule [" + id + "]");
                    }
                    return;
                }
            }
            System.out.println("Aucun véhicule avec l'ID [" + id + "] n'a été trouvé.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void louerVehicule(int id) {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return;
            } else if (vehicules.size() == 1 && vehicules.getFirst().getId() == id) {
                if (vehicules.getFirst().isEstLoue()) {
                    System.out.println("Le véhicule [" + id + "] est déjà loué.");
                } else {
                    vehicules.getFirst().setEstLoue(true);
                    System.out.println("Le véhicule [" + id + "] a été loué avec succès.");
                }
                return;
            }
            for (Vehicule v : vehicules) {
                if (v.getId() == id) {
                    if (v.isEstLoue()) {
                        System.out.println("Le véhicule [" + id + "] est déjà loué.");
                    } else {
                        v.setEstLoue(true);
                        System.out.println("Le véhicule [" + id + "] a été loué avec succès.");
                    }
                    return;
                }
            }
            System.out.println("Aucun véhicule avec l'ID [" + id + "] n'a été trouvé.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void retournerVehicule(int id) {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return;
            } else if (vehicules.size() == 1 && vehicules.getFirst().getId() == id) {
                if (!vehicules.getFirst().isEstLoue()) {
                    System.out.println("Le véhicule [" + id + "] n'est pas loué.");
                } else {
                    vehicules.getFirst().setEstLoue(false);
                    System.out.println("Le véhicule [" + id + "] a été retourné avec succès.");
                }
                return;
            }
            for (Vehicule v : vehicules) {
                if (v.getId() == id) {
                    if (!v.isEstLoue()) {
                        System.out.println("Le véhicule [" + id + "] n'est pas loué.");
                    } else {
                        v.setEstLoue(false);
                        System.out.println("Le véhicule [" + id + "] a été retourné avec succès.");
                    }
                    return;
                }
            }
            System.out.println("Aucun véhicule avec l'ID [" + id + "] n'a été trouvé.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Vehicule rechercherVehicule(int id) {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return null;
            } else if (vehicules.size() == 1 && vehicules.getFirst().getId() == id) {
                return vehicules.getFirst();
            }
            for (Vehicule v : vehicules) {
                if (v.getId() == id) {
                    return v;
                }
            }
            System.out.println("Aucun véhicule avec l'ID [" + id + "] n'a été trouvé.");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void afficherCompact() {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return;
            }
            vehicules.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void afficherParDisponibilite(boolean estDisponible) {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return;
            }
            if (estDisponible) {
                if (vehicules.size() == 1 && !vehicules.getFirst().isEstLoue()) {
                    System.out.println("Véhicules Disponibles:");
                    System.out.println(vehicules.getFirst());
                    return;
                } else if (vehicules.size() == 1 && vehicules.getFirst().isEstLoue()) {
                    System.out.println("Aucun véhicule disponible.");
                    return;
                }
                List<Vehicule> vehiculesDisponibles = new ArrayList<>();
                for (Vehicule v : vehicules) {
                    if (!v.isEstLoue()) {
                        vehiculesDisponibles.add(v);
                    }
                }
                if (!vehiculesDisponibles.isEmpty()) {
                    System.out.println("Véhicules Disponibles:");
                    vehiculesDisponibles.forEach(System.out::println);
                } else {
                    System.out.println("Aucun véhicule disponible.");
                }
            } else {
                if (vehicules.size() == 1 && vehicules.getFirst().isEstLoue()) {
                    System.out.println("Véhicules Non Disponibles:");
                    System.out.println(vehicules.getFirst());
                    return;
                } else if (vehicules.size() == 1 && !vehicules.getFirst().isEstLoue()) {
                    System.out.println("Aucun véhicule non disponible.");
                    return;
                }
                List<Vehicule> vehiculesNonDisponibles = new ArrayList<>();
                for (Vehicule v : vehicules) {
                    if (v.isEstLoue()) {
                        vehiculesNonDisponibles.add(v);
                    }
                }
                if (!vehiculesNonDisponibles.isEmpty()) {
                    System.out.println("Véhicules Non Disponibles:");
                    vehiculesNonDisponibles.forEach(System.out::println);
                } else {
                    System.out.println("Aucun véhicule non disponible.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void afficherParCategorie() {
        try {
            if (vehicules.isEmpty()) {
                System.out.println("La liste des véhicules est vide.");
                return;
            }
            if(vehicules.size() == 1 && vehicules.getFirst() instanceof Voiture) {
                System.out.println("Voitures:");
                vehicules.stream().filter(v -> v instanceof Voiture).forEach(System.out::println);
                return;
            } else if (vehicules.size() == 1 && vehicules.getFirst() instanceof Camion) {
                System.out.println("Camions:");
                vehicules.stream().filter(v -> v instanceof Camion).forEach(System.out::println);
                return;
            } else if (vehicules.size() == 1 && vehicules.getFirst() instanceof Moto) {
                System.out.println("Motos:");
                vehicules.stream().filter(v -> v instanceof Moto).forEach(System.out::println);
                return;
            }

            List<Vehicule> vehiculesVoiture = new ArrayList<>();
            List<Vehicule> vehiculesCamion = new ArrayList<>();
            List<Vehicule> vehiculesMoto = new ArrayList<>();

            for (Vehicule v : vehicules) {
                if (v instanceof Voiture) {
                    vehiculesVoiture.add(v);
                } else if (v instanceof Camion) {
                    vehiculesCamion.add(v);
                } else if (v instanceof Moto) {
                    vehiculesMoto.add(v);
                }
            }

            if (!vehiculesVoiture.isEmpty()) {
                System.out.println("Voitures:");
                vehiculesVoiture.forEach(System.out::println);
            }
            if (!vehiculesCamion.isEmpty()) {
                System.out.println("Camions:");
                vehiculesCamion.forEach(System.out::println);
            }
            if (!vehiculesMoto.isEmpty()) {
                System.out.println("Motos:");
                vehiculesMoto.forEach(System.out::println);
            }

            if (vehiculesVoiture.isEmpty() && vehiculesCamion.isEmpty() && vehiculesMoto.isEmpty()) {
                System.out.println("Aucun véhicule trouvé pour les catégories Voiture, Camion et Moto.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}