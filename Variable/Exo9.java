import java.util.Random;

public class Exo9 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(42) + 1;

        boolean isFortyTwo = (rand == 42) && Boolean.TRUE;

        System.out.println("Nombre généré : " + rand);
        System.out.println("Le nombre est 42 ? " + isFortyTwo);
    }
}