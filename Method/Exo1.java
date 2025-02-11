public class Addition {

    public int calculerSomme(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();

        int resultat = addition.calculerSomme(5, 10);

        System.out.println("La somme est : " + resultat);
    }
}
