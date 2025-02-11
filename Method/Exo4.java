public class Compteur {
    private int compteur = 0;

    public void incrementer(int valeur) {
        compteur += valeur;
    }

    public static void afficherCompteur(Compteur c) {
        System.out.println("Valeur du compteur : " + c.compteur);
    }

    public static void main(String[] args) {
        Compteur c = new Compteur();

        c.incrementer(5);
        c.incrementer(10);

        Compteur.afficherCompteur(c);
    }
}
