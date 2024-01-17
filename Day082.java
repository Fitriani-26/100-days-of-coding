import java.util.Scanner;

public class Day082 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        System.out.println("Masukkan Nilai :");
        nilai = input.nextInt();
        if (nilai >= 90) {
            System.out.println("Grade A");  
        }else if (nilai >= 80) {
            System.out.println("Grade B+");
        }else if (nilai >= 70){
            System.out.println("Grade B");
        }else if (nilai >= 60){
            System.out.println("Grade C");
        }else if (nilai >= 50){
            System.out.println("Grade D");
        }else {
            System.out.println("Grade E");
        }
    }  
}
