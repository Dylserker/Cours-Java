package Concept;

class Ariane6 extends Fusee {

    public Ariane6(double poids) {
        super("Ariane 6", poids);
    }

    public void lancementSpecific() {
        System.out.println("La fusée " + nom + " commence son lancement avec une poussée spécifique.");
    }

    public void separationEtages() {
        System.out.println("Les étages de la fusée " + nom + " se séparent après le lancement.");
    }
}