import java.util.Scanner;

public class Day034 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int panjang ;
        System.out.println("Masukkan panjang angka :");
        panjang = input.nextInt();

        for (int i = 1; i <= panjang; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();

        }
        
    }
    
}
