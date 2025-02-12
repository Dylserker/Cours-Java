package Concept;

class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    double calculerSurface() {
        return largeur * hauteur;
    }
}
