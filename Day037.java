import java.util.Scanner;

public class Day037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bil, genap, ganjil;

        System.out.println("Masukkan bilangan pertama : ");
        bil = sc.nextInt();

        ganjil = 0;
        genap = 0;

        for (int i = 1; i <= bil; i++){
            if (i % 2 == 0) {
                genap += i; 
            }else{
                ganjil += i;
            }
        }
        System.out.println("Genap : "+genap);
        System.out.println("Ganjil : "+ganjil);
    }
    
}
