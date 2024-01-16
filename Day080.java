import java.util.Scanner;

public class Day080 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();
         if (angka == 19) {
            System.out.println("Kosong");
         }else {
            for(int i = 1; i < angka; i++){
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println(i);
                }
            }
         }
    }
}
