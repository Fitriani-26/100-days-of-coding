import java.util.Scanner;

public class Day078 {
    public static void main(String[] args) {
        String nama;
        int total_biaya,jumlah_tiket,total_bayar;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan Jumlah Tiket : ");
        jumlah_tiket = input.nextInt();
        total_biaya = jumlah_tiket * 180000;
        total_bayar = (int) (total_biaya * 0.11);
        System.out.println("Biaya tiket yang Anda bayar = Rp." +total_bayar);
    }
}
