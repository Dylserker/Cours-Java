public class Exo8 {
    public static void main(String[] args) {
        char[] myArray42 = "quarante-deux".toCharArray();
        String recomposeWord = String.valueOf(myArray42);

        String finalSentence = recomposeWord + " - La grande réponse sur la vie, l’univers et le reste !";

        System.out.println(finalSentence);
    }
}