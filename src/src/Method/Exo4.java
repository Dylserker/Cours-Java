package Method;

public class Exo4 {
    public static void main(String[] args) {

        Compteur monCompteur = new Compteur();

        monCompteur.incrementer(5);
        monCompteur.incrementer(10);

        Compteur.afficherCompteur(monCompteur);
    }
}