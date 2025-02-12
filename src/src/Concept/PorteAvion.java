package Concept;
import java.util.ArrayList;
import java.util.List;

class PorteAvion {
    private List<Avion> avions = new ArrayList<>();

    public void ajouterAvion(Avion avion) {
        avions.add(avion);
    }

    public void lancerTousLesAvions() {
        for (Avion avion : avions) {
            avion.decoller();
        }
    }
}
