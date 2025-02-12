package Concept;

public class Exo2 {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Tesla Model S", "Rouge", 79999);
        voiture.afficherDetails();

        voiture.setPrix(-5000);
        voiture.setPrix(74999);
        voiture.afficherDetails();
    }
}