# Programme de gérer un parc automobile

## Description
Ce projet est une application Java qui permet de gérer un parc automobile. L'application permet d'ajouter, de supprimer, de louer et de retourner des véhicules (voitures, camions, motos), tout en affichant les informations pertinentes de manière flexible.

## Dépôt GitHub
Le code source de ce projet est disponible sur GitHub : [GererParcAutomobile](https://github.com/MorgunovE/GererParcAutomobile.git)

## Fonctionnalités
- Ajout de véhicules (voitures, camions, motos) au parc.
- Suppression de véhicules par identifiant.
- Location et retour de véhicules.
- Affichage des véhicules selon différents critères :
    - Affichage compact
    - Affichage par disponibilité
    - Affichage par catégorie
- Recherche de véhicules par identifiant.

## Structure du Projet
Le projet est structuré comme suit :
- `src/` : Contient les fichiers source Java.
    - `ParcAutomobile/` : Contient la classe `ParcAutomobile`.
    - `Vehicule/` : Contient les classes `Vehicule`, `Voiture`, `Camion`, `Moto`.
    - `Main.java` : Classe principale pour exécuter l'application.

## Compiler le projet
Pour compiler le projet, utilisez la commande suivante :
```sh
javac -d out -sourcepath src -cp src src/Main.java
```

## Exécuter le projet
Pour exécuter le projet, utilisez la commande suivante :
```sh
java -cp out Main
```

## Simulation de scénarios
Le projet inclut une simulation de scénarios pour tester les fonctionnalités du parc automobile :
- Ajout de véhicules prédéfinis.
- Location et retour de véhicules.
- Affichage des véhicules selon différents critères.
- Recherche de véhicules par identifiant.

## Vérification
Pour vérifier le bon fonctionnement du projet, exécutez les scénarios de simulation inclus dans la méthode main de la classe Main.

## Utilisation
1. Clonez le dépôt GitHub.
2. Compilez le projet.
3. Exécutez le projet.
4. Suivez les instructions affichées dans la console pour interagir avec le parc automobile.

## Auteur
Ce projet a été réalisé par [Evgenii Morgunov](https://github.com/MorgunovE/)

## Licence
Ce projet est sous licence MIT.