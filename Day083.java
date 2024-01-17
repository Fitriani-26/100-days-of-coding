import java.util.Scanner;

public class Day083 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, genap, ganjil;
        ganjil = 0;
        genap = 0;
        System.out.println("Masukkan Angka : ");
        angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                genap += i;
            } else {
                ganjil += i;
            }
        }
        System.out.println("Genap = " + genap);
        System.out.println("Ganjil = " + ganjil);
    }
}
