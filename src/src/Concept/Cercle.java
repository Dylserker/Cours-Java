package Concept;

class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}