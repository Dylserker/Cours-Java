package Attribut;
public class Exo2 {
    public String titre;

    public static void main(String[] args) {
        Exo2 livre = new Exo2();

        livre.titre = "Harry Potter et la Pierre Philosophale";

        System.out.println("Titre du livre : " + livre.titre);
    }
}