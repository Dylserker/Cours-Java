package Concept;

public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void seDeplacer();

    void manger() {
        System.out.println("Manger");
    }
}