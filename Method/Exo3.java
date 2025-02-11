public class Calculatrice {

    public double add(int a, int b) { return a + b; }
    public double sous(int a, int b) { return a - b; }
    public double multi(int a, int b) { return a * b; }
    public double divid(int a, int b) { return (double) a / b; }

    public double add(double a, double b) { return a + b; }
    public double sous(double a, double b) { return a - b; }
    public double multi(double a, double b) { return a * b; }
    public double divid(double a, double b) { return a / b; }

    public double effectuerOperation(String operation, double a, double b) {
        return switch (operation) {
            case "add" -> add(a, b);
            case "sous" -> sous(a, b);
            case "multi" -> multi(a, b);
            case "divid" -> divid(a, b);
            case "secret" -> "easter egg".hashCode();
            default -> throw new IllegalArgumentException("Opération inconnue");
        };
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        System.out.println("Addition : " + calc.effectuerOperation("add", 5, 3));
        System.out.println("Multiplication : " + calc.effectuerOperation("multi", 2.5, 4));
        System.out.println("Easter Egg : " + calc.effectuerOperation("secret", 0, 0));
    }
}
