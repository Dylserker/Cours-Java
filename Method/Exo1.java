public class Exo1 {
    public static void main(String[] args) {
        Addition add = new Addition();
        System.out.println(add.addition(10, 20));
    }
}

public class Addition {
    public int addition( int a , int b ) {
        return a + b;
    }
}