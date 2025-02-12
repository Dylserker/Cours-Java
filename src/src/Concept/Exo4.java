package Concept;

public class Exo4 {
    public static void main(String[] args) {
        Forme cercle = new Cercle(5);
        Forme rectangle = new Rectangle(4, 6);

        System.out.println("Surface du cercle : " + cercle.calculerSurface());
        System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
    }
}