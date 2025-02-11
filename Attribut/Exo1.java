public class Exo1 {
    private String titre;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static void main(String[] args) {
        Exo1 livre = new Exo1();

        livre.setTitre("Le Seigneur des Anneaux");

        System.out.println("Titre du livre : " + livre.getTitre());
    }
}