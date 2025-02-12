package Variable;
public class Exo13 {
    public static void main(String[] args) {
        int a = 24;
        int b = 42;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Valeur de a : " + a);
        System.out.println("Valeur de b : " + b);
    }
}