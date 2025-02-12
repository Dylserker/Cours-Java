package Attribut;
public class Exo4 {
    private static int nombreDeComptes = 0;

    public Exo4() {
        nombreDeComptes++;
    }

    public static int getNombreDeComptes() {
        return nombreDeComptes;
    }

    public static void main(String[] args) {
        new Exo4();
        new Exo4();
        new Exo4();

        System.out.println("Nombre de comptes créés : " + Exo4.getNombreDeComptes());
    }
}
