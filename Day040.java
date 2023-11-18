import java.util.ArrayList;
import java.util.Scanner;

public class Day040 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <Integer> genap = new ArrayList<>();
        ArrayList <Integer> ganjil = new ArrayList<>();

        System.out.println("Masukkan batas Awal : ");
        int batasAwal = input.nextInt();
        System.out.println("Masukkan batas Akhir : ");
        int batasAkhir = input.nextInt();
        
        for (batasAwal = 10; batasAwal <= batasAkhir; batasAwal++){
            if (batasAwal % 2 == 0 ) {
                genap.add(batasAwal); 
            }else{
                ganjil.add(batasAwal);
            }
        }
        System.out.println(genap);
        System.out.println(ganjil);
    }
    
}
