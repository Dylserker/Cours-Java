package Variable;
import java.util.Objects;

public class Exo5 {
    public static void main(String[] args) {
        Integer existingVar = null;
        Integer myVar = Objects.requireNonNullElse(existingVar, 42);

        System.out.println("Valeur de myVar : " + myVar);
    }
}