package Concept;

public class Mammifere extends Animal {
    Mammifere(String name) {
        super(name);
    }

    public void seDeplacer() {
        System.out.println(name + "seDeplacer");
    }

    public void voler() {
        System.out.println(name + "Marcher");
    }
}