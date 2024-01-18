import java.util.Scanner;

public class Day099 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilih ;
        double alas,tinggi,luasSegitiga;
        int panjang,lebar,luasPersegi;
        System.out.println("Bentuk apa yang ingin Dihitung : ");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi Panjang");

        System.out.print("Masukkan Pilihan : ");
        pilih = input.nextInt();

        if (pilih == 1) {
            System.out.print("Masukkan Nilai alas : ");
            alas = input.nextDouble();
            System.out.print("Masukkan Nilai Tinggi : ");
            tinggi = input.nextDouble();

            luasSegitiga = 0.5 * alas * tinggi;
            System.out.print("Luas Segitiga = "+luasSegitiga);
            
        }else if(pilih == 2){
            System.out.print("Masukkan Nilai Panjang : ");
            panjang = input.nextInt();
            System.out.print("Masukkan Nilai Lebar : ");
            lebar = input.nextInt();
            luasPersegi = panjang * lebar;
            System.out.println("Luas Persegi Panjang : "+luasPersegi);
            
        }else{
            System.out.println("Masukkan inputan yang benar");
        }
        
    }
    
}
