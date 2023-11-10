import java.util.ArrayList;
import java.util.Scanner;

public class Day033 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int total = 0;
        while (true) {
            ArrayList<Integer> angka = new ArrayList<>();

            System.out.println("Masukkan nilai : ");
            int nilai = input.nextInt();
            angka.add(nilai);
            total += nilai;
            System.out.println(total);

            if (total > 100) {
                break;
            }
        }
    }
}
