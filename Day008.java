import java.util.Scanner;

public class Day008 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Luas Lingkaran");
        double luas = 0.0;

        System.out.print("Masukkan Jari-jari : ");
         double jari = input.nextDouble();

         luas = Math.PI * jari * jari;
         System.out.println("Luas = "+luas);

        
    }

    
}