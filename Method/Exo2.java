public class Personne {
    private String nom;
    private int age;
    private String adresse;

    public Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    public void afficherNom() {
        System.out.println("Nom : " + nom);
    }

    private void changerNom(String nom) {
        this.nom = nom;
    }

    protected void afficherAge() {
        System.out.println("Âge : " + age);
    }

    void afficherAdresse() {
        System.out.println("Adresse : " + adresse);
    }
}
public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Alice", 30, "123 rue Principale");

        personne.afficherNom();
        personne.afficherAdresse();

    }
}
public class TestPersonne {
    public static void main(String[] args) {
        Personne personne = new Personne("Bob", 25, "456 avenue Secondaire");

        personne.afficherNom();
        personne.afficherAge();
        personne.afficherAdresse();
    }
}