class Animal {
    protected String nom;
}

public class Exo3 extends Animal {
    public void afficherNom() {
        System.out.println("Nom du chien : " + nom);
    }

    public static void main(String[] args) {
        Exo3 chien = new Exo3();

        chien.nom = "Rex";

        chien.afficherNom();
    }
}