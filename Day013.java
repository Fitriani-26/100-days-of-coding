import java.util.Arrays;

public class Day013 {
    public static void main(String[] args) {
        
        int [] arrayInteger = {1, 5, 7, 8, 2};
        float [] arrayFloat = {1.2f, 3.5f, 5.7f, 8.9f, 10.0f};
        double [] arrayDouble = {2.45, 4.50, 6.8, 10.5, 62.5};

        System.out.println("Bilangan Integer dalam Array : " + Arrays.toString(arrayInteger));
        System.out.println("Bilangan Float dalam Array : " + Arrays.toString(arrayFloat));
        System.out.println("Bilangan Double dalam Array : " +Arrays.toString(arrayDouble));

        System.out.println(arrayInteger[0]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayDouble[4]);
    }

}