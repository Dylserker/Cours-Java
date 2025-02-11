public class Exo5 {
    private String marque;

    public Exo5(String marque) {
        this.marque = marque;
    }

    public void afficherMarque() {
        System.out.println("Marque de la voiture : " + marque);
    }

    public static void main(String[] args) {
        Exo5 voiture = new Exo5("Tesla");

        voiture.afficherMarque();
    }
}