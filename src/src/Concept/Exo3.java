package Concept;

public class Exo3 {
    public static void main(String[] args) {
        Employer enseignant = new Enseignant();
        Employer directeur = new Directeur();
        Employer personnelAdministratif = new PersonnelAdministratif();

        enseignant.travailler();
        directeur.travailler();
        personnelAdministratif.travailler();
    }
}