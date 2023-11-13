import java.util.Scanner;

public class Day035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bil1,bil2;

        System.out.print("Masukkan bilangan pertama : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        bil2 = sc.nextInt();

        int hasil = bil1 *  bil2;

        if (hasil  % 2 == 0) {
            hasil += 4;
        }else{
            hasil -= 2;
        }
        System.out.println(hasil);
    }
}