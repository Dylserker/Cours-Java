package Concept;

class Voiture {
    private String modele;
    private String couleur;
    private double prix;

    public Voiture(String modele, String couleur, double prix) {
        this.modele = modele;
        this.couleur = couleur;
        setPrix(prix);
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("Voici le prix après réduction");
        }
    }

    public void afficherDetails() {
        System.out.println("Modèle: " + modele + ", Couleur: " + couleur + ", Prix: " + prix + "€");
    }
}
