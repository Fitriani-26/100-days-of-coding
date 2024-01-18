import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlahData, total;
        total = 0;

        System.out.print("Masukkan Jumlah data : ");
        jumlahData = input.nextInt();

        int [] angka = new int[jumlahData];

        for(int i = 1; i < jumlahData; i++){
            System.out.print("Masukk an Data ke -" + i + ": ");
            int data = input.nextInt();

            if (data > 0 && data % 2 ==0 ) {
                angka[i] = data;
                total += data;
            }else{
                System.out.println("Masukkan angka positif dan genap. Masukkan lagi");
                i--;
            }

        }
        System.out.println("Angka postif yang di masukkan : ");
        for(int data : angka){
            if (data > 0) {
                System.out.println(data + " ");
            }
        } 
        System.out.println("Total hasil penjumlahan = "+total);
    }     
        
 }
  
