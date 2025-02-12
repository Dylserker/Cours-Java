package Concept;

class Oiseau extends Animal {
    Oiseau(String name) {
        super(name);
    }

    public void seDeplacer() {
        System.out.println(name + "seDeplacer");
    }

    public void voler() {
        System.out.println(name + "vole");
    }
}