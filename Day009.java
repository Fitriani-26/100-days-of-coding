import java.util.Scanner;

public class Day009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda ");
        double nilai = input.nextDouble();

        if (nilai >= 85.0) {
           System.out.println("A");
        }else if (nilai >= 80.0){
            System.out.println("A-");
        }else if (nilai >= 75.0){
            System.out.println("B+");
        }else if (nilai >= 70.0){
            System.out.println("B");
        }else if (nilai >= 65.0){
            System.out.println("B-");
        }else if (nilai >= 60.0){
            System.out.println("C");
        } else if (nilai >= 50.0){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
        
    }
  
}