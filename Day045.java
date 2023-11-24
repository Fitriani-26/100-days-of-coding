import java.util.Scanner;

public class Day045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input panjang dan lebar tanah dari pengguna
        System.out.print("Masukkan panjang tanah (meter): ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar tanah (meter): ");
        double lebar = sc.nextDouble();

        // Memanggil fungsi untuk menghitung luas tanah
        double luas = Day045(panjang, lebar);

        // Menampilkan hasil
        System.out.println("Luas tanah adalah: " + luas + " meter persegi");

    }

    // Fungsi untuk menghitung luas tanah
    public static double Day045(double panjang, double lebar) {
        return panjang * lebar;
    }
}