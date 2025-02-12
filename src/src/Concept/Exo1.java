package Concept;

public class Exo1 {
    public static void main(String[] args) {
        Mammifere tigre = new Mammifere("Tigre");
        Oiseau aigle = new Oiseau("Aigle");
        Reptile serpent = new Reptile("Serpent");

        tigre.seDeplacer();
        tigre.manger();

        aigle.seDeplacer();
        aigle.manger();

        serpent.seDeplacer();
        serpent.manger();
    }
}