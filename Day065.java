import java.util.ArrayList;
import java.util.Scanner;

public class Day065 {
    public static void main(String[] args) {
        int panjang,hasil = 0;
        ArrayList <Integer> angka = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Panjang array : ");
        panjang = sc.nextInt();
        for(int i = 0; i < panjang; i++){
            System.out.print("Masukkan Data ");
            int data = sc.nextInt();
            angka.add(data);
            hasil += data;
            System.out.println(angka);
            System.out.println(data);
        }   
    }
  }