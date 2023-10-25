import java.math.BigDecimal;
import java.util.Scanner;

public class Day017 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BigDecimal num1, num2;

        System.out.print("Masukkan angka 1 = ");
        num1 = input.nextBigDecimal();

        System.out.print("Masukkan angka 2 = ");
        num2 = input.nextBigDecimal();


        BigDecimal tambah = num1.add(num2);
        BigDecimal kurang = num1.subtract(num2);
        BigDecimal kali = num1.multiply(num2);
    
        System.out.println("Hasil Penjumlahan = " + tambah);
        System.out.println("Hasil Pengurangan = " + kurang);
        System.out.println("Hasil Perkalian = " + kali);

    }
    
}
