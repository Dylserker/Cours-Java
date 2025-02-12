package Concept;

public class Exo5 {
    public static void main(String[] args) {
        PorteAvion porteAvion = new PorteAvion();

        Avion avion1 = new AvionDeChasse();
        Avion avion2 = new AvionDeTransport();
        Avion avion3 = new Avion();

        porteAvion.ajouterAvion(avion1);
        porteAvion.ajouterAvion(avion2);
        porteAvion.ajouterAvion(avion3);

        porteAvion.lancerTousLesAvions();
    }
}