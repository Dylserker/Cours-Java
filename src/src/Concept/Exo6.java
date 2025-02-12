package Concept;

public class Exo6 {
    public static void main(String[] args) {
        Ariane6 ariane6 = new Ariane6(500000.0);

        System.out.println("Fusée " + ariane6.nom + " créée, Poids : " + ariane6.poids + " kg.");

        ariane6.lancer();

        ariane6.lancementSpecific();
        ariane6.separationEtages();
    }
}