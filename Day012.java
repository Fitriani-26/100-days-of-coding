import java.util.Scanner;

public class Day012 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Huruf yang di cari : ");
        String cari = input.nextLine();
        String nameTanpaCari = nama.replace(cari, "");
    
        System.out.println("Nama : " + nama + " , " + nama.toUpperCase() + " , " + nama.toLowerCase());
        System.out.println("Panjang Karakter : " + nama.length());
        System.out.println("Huruf Awalan " + nama.charAt(0));
        System.out.println("Huruf Akhiran " + nama.charAt(nama.length()-1));
        System.out.println("Huruf " + cari + " = " + (nama.length() - nameTanpaCari.length()));
    }
    
}

