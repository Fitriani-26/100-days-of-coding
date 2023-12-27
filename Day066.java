import java.util.Scanner;

public class Day066 {
    public static void main(String[] args) {
        float angka1, angka2, angka3, hasil;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka Pertama : ");
        angka1 = sc.nextFloat();
        System.out.print("Masukkan Angka Kedua : ");
        angka2 = sc.nextFloat();
        System.out.print("Masukkan Angka Ketiga : ");
        angka3 = sc.nextFloat();

        if (angka1 % angka3 == 0) {
            hasil = angka1 / angka3 + 2;
        }else{
            hasil = angka1 / angka2 - 2;    
        }
        System.out.println(hasil);
    }
    
}
