package Concept;

class Reptile extends Animal {
    Reptile(String name) {
        super(name);
    }

    public void seDeplacer() {
        System.out.println(name + "seDeplacer");
    }

    public void ramper() {
        System.out.println(name + "ramper");
    }
}