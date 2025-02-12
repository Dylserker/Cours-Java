package Variable;
public class Exo10 {
    public static void main(String[] args) {
        Integer my42TypeInt = 42;
        Double my42TypeDouble = 42.0;
        Float my42TypeFloat = 42.0f;
        Long my42TypeLong = 42L;
        Short my42TypeShort = 42;
        Byte my42TypeByte = 42;
        Boolean my42TypeBoolean = true;
        Character my42TypeChar = 'A';
        String my42TypeString = "quarante-deux";

        System.out.println("my42TypeInt : " + my42TypeInt.getClass().getSimpleName());
        System.out.println("my42TypeDouble : " + my42TypeDouble.getClass().getSimpleName());
        System.out.println("my42TypeFloat : " + my42TypeFloat.getClass().getSimpleName());
        System.out.println("my42TypeLong : " + my42TypeLong.getClass().getSimpleName());
        System.out.println("my42TypeShort : " + my42TypeShort.getClass().getSimpleName());
        System.out.println("my42TypeByte : " + my42TypeByte.getClass().getSimpleName());
        System.out.println("my42TypeBoolean : " + my42TypeBoolean.getClass().getSimpleName());
        System.out.println("my42TypeChar : " + my42TypeChar.getClass().getSimpleName());
        System.out.println("my42TypeString : " + my42TypeString.getClass().getSimpleName());
    }
}