import java.util.Scanner;

public class Day038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int biaya, hargaTiket, jumlahTiket,totalBiaya;
        double pajak;
        String nama;

        System.out.println("Masukkan Nama Penumpang :");
        nama = sc.nextLine();

        System.out.println("Masukkan Jumlah Tiket : ");
        jumlahTiket = sc.nextInt();

        biaya = 180000;
        hargaTiket = jumlahTiket * biaya;
        pajak = 0.11 * hargaTiket;
        totalBiaya = hargaTiket + (int) pajak;

        System.out.println("Nama Penumpang : "+nama);
        System.out.println("Jumlah Tiket : "+jumlahTiket);
        System.out.println("Biaya Tiket : "+totalBiaya);



        
    }
    
}
