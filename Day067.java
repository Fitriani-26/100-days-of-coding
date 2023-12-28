import java.util.Scanner;

public class Day067 {
    public static void main(String[] args) {
         StringBuffer dataDiri = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = sc.nextLine();
        dataDiri.append("Nama Depan: ").append(namaDepan).append("\n");

        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = sc.nextLine();
        dataDiri.append("Nama Belakang: ").append(namaBelakang).append("\n");

        System.out.print("Masukkan Usia: ");
        int usia = sc.nextInt();
        dataDiri.append("Usia: ").append(usia).append(" Tahun");

        // Menampilkan hasil dengan StringBuffer
        System.out.println("=== Data Diri ===");
        System.out.println(dataDiri.toString());
    }
    
}
