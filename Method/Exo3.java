public class Calculatrice {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int sous(int a, int b) {
        return a - b;
    }

    public double sous(double a, double b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public int divid(int a, int b) {
        return a / b;
    }

    public double divid(double a, double b) {
        return a / b;
    }

    public double effectuerOperation(String operation, double a, double b) {
        double result = 0;

        switch (operation) {
            case "add":
                result = add(a, b);
                break;
            case "sous":
                result = sous(a, b);
                break;
            case "multi":
                result = multi(a, b);
                break;
            case "divid":
                result = divid(a, b);
                break;
            case "secret":
                System.out.println("Easter Egg détecté ! Vous avez trouvé le secret.");
                result = 42;
                break;
            default:
                System.out.println("Opération inconnue.");
        }

        return result;
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("Addition (2 + 3): " + calc.effectuerOperation("add", 2, 3));
        System.out.println("Soustraction (5 - 2): " + calc.effectuerOperation("sous", 5, 2));
        System.out.println("Multiplication (4 * 6): " + calc.effectuerOperation("multi", 4, 6));
        System.out.println("Division (10 / 2): " + calc.effectuerOperation("divid", 10, 2));

        System.out.println("Opération secrète (Easter Egg): " + calc.effectuerOperation("secret", 0, 0));
    }
}
