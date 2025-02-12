class Compteur {
    // Variable d'instance pour stocker la valeur du compteur
    private int compteur;

    // Méthode d'instance pour incrémenter la valeur du compteur
    public void incrementer(int valeur) {
        compteur += valeur; // Ajoute la valeur à la variable compteur
    }

    // Méthode statique pour afficher la valeur actuelle du compteur
    public static void afficherCompteur(Compteur c) {
        System.out.println("Valeur du compteur : " + c.compteur); // Affiche la valeur du compteur
    }

    // Constructeur pour initialiser le compteur à zéro
    public Compteur() {
        compteur = 0;
    }
}

// Classe principale avec la méthode main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'un objet de la classe Compteur
        Compteur monCompteur = new Compteur();

        // Appel de la méthode d'instance pour incrémenter le compteur
        monCompteur.incrementer(5); // Incrémente le compteur de 5
        monCompteur.incrementer(10); // Incrémente le compteur de 10

        // Appel de la méthode statique pour afficher la valeur du compteur
        Compteur.afficherCompteur(monCompteur); // Affiche "Valeur du compteur : 15"
    }
}