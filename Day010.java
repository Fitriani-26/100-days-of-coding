import java.util.Scanner;

public class Day010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;

        System.out.print("Masukkan jumlah data yang akan dimasukkan: ");
        jumlahData = input.nextInt();

        int total = 0;

        for (int bil = 1; bil <= jumlahData; bil++) {
            System.out.print("Masukkan data ke-" + bil + ": ");
            int data = input.nextInt();
            total += data;
        }

        System.out.println("Total keseluruhan dari semua data adalah: " + total);
    }

    
}